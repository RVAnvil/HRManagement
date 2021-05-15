pipeline{
    agent any
        tools{
            maven 'maven_3_8_1'
   
        }
    stages{
        stage("Git Checkout"){
            steps{
                 git 'https://github.com/RVAnvil/HRManagement.git'
            }
        }
        stage ('Compile Stage') {

            steps {
                {
                    sh 'mvn clean compile'
                }
            }
        }
  
    }
}
