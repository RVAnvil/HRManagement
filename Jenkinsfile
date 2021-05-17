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
        def scannerHome = tool 'SonarScanner 4.0';
        withSonarQubeEnv('sonar-8') { // If you have configured more than one global server connection, you can specify its name
        sh "${scannerHome}/bin/sonar-scanner"
    }
  }  
        
    }
}
