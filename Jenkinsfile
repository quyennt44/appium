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
                sh "clean test -DTestNG-FILE-NAME=src\main\resources\suites\TestNG-all_test.xml"	
            }
        }     
    }
    post {
        always {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        }     
    }
}
