pipeline {
    agent {
        label 'master'
    }   

    stages {
        stage('Check out') {
            steps {
                git 'https://github.com/quyennt44/appium.git'
            }
        }

        stage('Start docker'){
            steps{
                sh "adb kill-server"
                sh "docker-compose up -d"
            }
        }
	
	stage ("Wait for container starting") {
          steps{
           echo "Waiting for deployment to complete prior starting testing"
           sleep 60 //seconds
           }
        }

        stage('Test') {
            steps {
                sh "mvn clean test -DTestNG-FILE-NAME=src/main/resources/suites/TestNG-each-feature-per-file.xml"	
            }
        }     
    }
    post {
        always {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        sh "docker-compose down"	
        }     
    }
}

