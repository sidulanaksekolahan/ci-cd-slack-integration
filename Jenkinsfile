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

                // Grant execute permission to the mvnw script
                sh 'chmod +x ./mvnw'

                // compile the code and build the JAR
                sh './mvnw clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'docker build -t mirfanduri/ci-cd-slack-integration .'
                sh 'docker run -d -p 8081:8080 mirfanduri/ci-cd-slack-integration'
            }
        }
    }
}