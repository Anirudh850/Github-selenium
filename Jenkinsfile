pipeline {
    agent any

    tools {
        maven 'Maven_3.9'   // Ensure Maven is configured in Jenkins global tools
        jdk 'JDK_17'        // Ensure JDK is configured in Jenkins global tools
    }

    stages {
        stage('Checkout') {
             steps {

            credentialsId: 'your-credential-id', 
            url: 'https://github.com/Anirudh850/Github-selenium.git'
   
    }
}
            

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Parallel Tests') {
            parallel {
                stage('Unit Tests') {
                    steps {
                        sh 'mvn -Dtest=*UnitTest test'
                    }
                }
                stage('Integration Tests') {
                    steps {
                        sh 'mvn -Dtest=*IntegrationTest test'
                    }
                }
                stage('Functional Tests') {
                    steps {
                        sh 'mvn -Dtest=*FunctionalTest test'
                    }
                }
            }
        }
    }

    post {
        always {
            junit '*/target/surefire-reports/.xml'
        }
    }
}
