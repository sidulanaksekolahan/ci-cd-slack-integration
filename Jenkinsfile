pipeline {
    agent any

    stages {
        stage('Checkout') {
            step {
                echo 'Cloning repository'
                // clone the repository
                git url: 'https://github.com/sidulanaksekolahan/ci-cd-slack-integration.git', branch: 'master'
            }
        }

        stage('Build') {
            step {
                echo 'Building...'
            }
        }

        stage('Deploy') {
            step {
                echo 'Deploying...'
            }
        }
    }