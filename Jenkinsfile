pipeline {
    agent any
    stages {
        stage('Check out') {
            steps {
                git 'https://github.com/quyennt44/appium.git'
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
        }     
    }
}
