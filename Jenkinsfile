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
                        // Go inside src where HelloWorld.java actually exists
                            echo "Compiling Java code..."
                            bat 'pwd'
                    }
                }

//                 stage('Run') {
//                     steps {
//                         dir('C:/Myntra/untitled') {
//                            echo "Running programs..."
//                            bat 'java -cp out HelloWorld'
//                            bat 'java -cp out PrimeNumber'
//                            bat 'java -cp out Fibonacci'
//                            bat 'java -cp out Evoting'
//                          }
//                        }
//                  }
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
