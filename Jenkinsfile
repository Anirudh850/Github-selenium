pipeline {
    agent any

    tools {
        maven 'Maven_3.9'   // Ensure this name matches Manage Jenkins > Tools
        jdk 'JDK_17'        // Ensure this name matches Manage Jenkins > Tools
    }

    stages {
        stage('Checkout') {
            steps {
                git(
                    branch: 'main',
                    credentialsId: 'your-credential-id', // Replace with your actual Credential ID
                    url: 'https://github.com/Anirudh850/Github-selenium.git'
                )
            }
        }
        stage('Unit Tests') {
                    steps {
                        // Fixed: Added 'test' goal and used 'bat' for Windows
                        bat 'mvn -Dtest=SeleniumTest test'
                    }
                }

        /*stage('Parallel Tests') {
            parallel {
                stage('Unit Tests') {
                    steps {
                        // Fixed: Added 'test' goal and used 'bat' for Windows
                        bat 'mvn -Dtest=SeleniumTest test'
                    }
                }
            }
        }*/
    }

    post {
        always {
            // Fixed: Corrected the wildcard path for surefire reports
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
