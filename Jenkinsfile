pipeline {
    stages {
        stage('git-int') {
            agent { 
                label 'testing'
                 git branch: 'main', url: 'https://github.com/nikhil15041993/website.git'
            }
            steps {
                echo "git int"
            }
            
        }
        
    }
}
