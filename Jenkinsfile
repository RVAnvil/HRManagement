pipeline{
    agent any
    tools{
        maven 'maven_3_8_1'
    }
    stages{
        stage("git"){
            steps{
                git 'https://github.com/RVAnvil/HRManagement.git'
            }
        }
        stage("Maven Build"){
            steps{
                sh 'mvn clean package'
            }
        }
  
    }
}
