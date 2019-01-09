pipeline {
    agent any
    stages {
        stage('Check out') {
            steps {
                git 'https://github.com/quyennt44/appium.git'
            }
        }

        stage('Start docker'){
            steps{
                sh "docker-compose up -d"
            }
        }
	
	stage ("Wait for container starting") {
          steps{
           echo "Waiting for deployment to complete prior starting testing"
           sleep 120 //seconds
           }
        }

        stage('Test') {
            steps {
                sh "mvn clean test -DTestNG-FILE-NAME=src/main/resources/suites/TestNG-each-feature-per-file.xml"	
            }
        }

      stage('Stop docker'){
            steps{
                sh "docker-compose down"
		//incase docker-compose does not work:
                sh "docker stop $(docker ps -aq)"
                sh "docker rm $(docker ps -aq)"
            }
        }
     
    }
    post {
        always {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        }     
    }
}

