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
        
       
    }
}

