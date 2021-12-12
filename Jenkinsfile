pipeline {
    agent none
    stages {
     
        stage('Test on staging') {
            agent { 
                label 'staging'
            }
            steps {
               sudo mkdir staging-test
            }
            
        }
        stage('Test on production') {
            agent {
                label 'production'
            }
            steps {
                 sudo mkdir staging-production
            }
           
        }
    }
}
