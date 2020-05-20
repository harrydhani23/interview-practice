pipeline {
    agent any
    stages {
        stage('checout directory from git') {
            steps {
                git credentialsId: '5a3005bc-2511-411e-9f6d-4d64a6aaffef', url: 'https://github.com/harrydhani23/interview-practice.git'
            }
        }
         stage('run test') {
            steps {
                bat 'mvn clean test'
            }
         }
         stage('Publishing Report') {
            steps {
            step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            }
         }
    }

}


