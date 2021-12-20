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
                
                sh '''sudo docker rm -f $(sudo docker ps -a -q)

                sudo docker build /home/ubuntu/jenkins/workspace/git-int/ -t website1 

                sudo docker run -it -p 80:80 -d website1'''
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

