pipeline {
    agent none
    stages {
     
        stage('Test on staging') {
            agent { 
                label 'staging'
            }
            steps {
                mkdir staging-test
            }
            
        }
        stage('Test on production') {
            agent {
                label 'production'
            }
            steps {
                  mkdir staging-production
            }
           
        }
    }
}
