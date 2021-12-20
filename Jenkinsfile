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
        stage('git initilize') {
            agent { 
                label 'testing'
            }
            steps {
               git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
                
               
            }
            
        }
        stage('creating a docker container from dockerfile') {
            agent {
                label 'testing'
            }
            steps {
                  sh '''sudo docker rm -f $(sudo docker ps -a -q)

                  sudo docker build /home/ubuntu/jenkins/workspace/mypipelines -t website

                  sudo docker run -it -p 80:80 -d website'''
            }
           
        }
        
        
        stage('git initilize for production') {
            agent {
                label 'production'
            }
            steps {
                  git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
                
            }
           
        }
    }
}

