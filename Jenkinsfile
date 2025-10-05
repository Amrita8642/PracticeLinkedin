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
         stage('Compile') {
                    steps {
                    dir('C:/ProgramData/Jenkins/.jenkins/workspace/Practice/src/main/java'){
                        // Go inside src where HelloWorld.java actually exists
                            echo "Compiling Java code..."
                            bat 'javac Fibonacciseries.java -d ../out'
                            }
                    }
                }

                stage('Run') {
                    steps {
                      dir('C:/ProgramData/Jenkins/.jenkins/workspace/Practice/src/main') {
                           echo "Running programs..."
                           bat 'java -cp out Fibonacciseries'
                         }
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
