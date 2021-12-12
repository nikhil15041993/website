pipeline {
    agent none
    stages {
     
        stage('Test on staging') {
            agent { 
                label 'staging'
            }
            steps {
                touch staging
            }
            
        }
        stage('Test on production') {
            agent {
                label 'production'
            }
            steps {
                  touch production
            }
           
        }
    }
}
