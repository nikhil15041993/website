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





def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}

