pipeline{
    agent any
        tools {
        maven 'maven_3_8_1'
        
    }
    stages{
        stage("Git Checkout"){
            steps{
                 git 'https://github.com/RVAnvil/HRManagement.git'
            }
        }
       stage ('Build') {
            steps {
                bat 'mvn clean install' 
            }
        }
     stage('SonarQube analysis') {
    withSonarQubeEnv('sonar-8') { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
    }
  }
        
    }
}
