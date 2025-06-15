pipeline {
    agent any

    tools {
        maven 'Maven'       // Use the Maven tool name configured in Jenkins
        jdk 'JDK11'        // Or 'JDK11' if that's what you configured
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo '✅ Build and test completed successfully!'
        }
        failure {
            echo '❌ Build failed. Check console output.'
        }
    }
}


