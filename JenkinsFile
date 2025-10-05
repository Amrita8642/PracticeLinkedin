pipeline {
    agent any

    tools {
        // Use the exact names from Manage Jenkins → Global Tool Configuration
        maven 'Maven'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Amrita8642/PracticeLinkedin.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }

    post {
        success {
            echo " Build completed successfully!"
        }
        failure {
            echo " Build failed. Please check the logs."
        }
    }
}
