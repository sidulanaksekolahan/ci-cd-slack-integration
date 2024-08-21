pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning repository'
                // clone the repository
                git url: 'https://github.com/sidulanaksekolahan/ci-cd-slack-integration.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'

                // compile the code and build the JAR
                sh './mvnw clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}