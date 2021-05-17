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
            steps{
                withSonarQubeEnv('sonar-8') { 
                    bat 'mvn sonar:sonar '
                    }
             }
        }     
    }
}
