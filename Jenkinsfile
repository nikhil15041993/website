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
               git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
            }
            
        }
        stage('Test on Windows') {
            agent {
                label 'production'
            }
            steps {
                 git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
            }
           
        }
    }
}

