// Declarative //
pipeline {
    agent none
    stages {
        stage('Build') {
            agent any
            steps {
                checkout scm
                echo "checkout scm"
            }
        }
        stage('Test on Linux') {
            agent { 
                label 'testing'
            }
            steps {
                echo "testing"
            }
            
        }
        stage('Test on Windows') {
            agent {
                label 'production'
            }
            steps {
                 echo "production"
            }
           
        }
    }
}

