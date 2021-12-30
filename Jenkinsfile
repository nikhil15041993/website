// Declarative //
pipeline {
    agent none
    stages {
        
        
        
        stage('git initilize') {
            agent { 
                label 'testing'
            }
            steps {
               git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
                
               
            }
            
        }
        
        
         stage(' Remove existing container and create a docker contaier from dockerfile ') {
            agent { 
                label 'testing'
            }
            steps {
             sh '''sudo docker rm -f $(sudo docker ps -a -q)

                  sudo docker build /home/ubuntu/jenkins/workspace/git-init -t website

                  sudo docker run -it -p 80:80 -d website''' 
               
            }
            
        }
        
        
        
        
       
    }
}

