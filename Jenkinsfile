pipeline {
    agent any
    //Waiting time	
    parameters {
        string(defaultValue: 60, description: 'time waiting for docker starting', name: 'waitTime')
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
           sleep '${params.waitTime}' //seconds
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
                sh 'docker stop $(docker ps -aq)'
                sh 'docker rm $(docker ps -aq)'
            }
        }
     
    }
    post {
        always {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        }     
    }
}

