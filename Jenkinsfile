pipeline {
    agent none
    stages {
     
        stage('Test on staging') {
            agent { 
                label 'staging'
            }
            steps {
                echo "hello staging"
            }
            
        }
        stage('Test on production') {
            agent {
                label 'production'
            }
            steps {
                  echo "hello-production"
            }
           
        }
    }
}
