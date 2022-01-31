def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

def branchApp(){
    git url: 'https://github.com/nikhil15041993/website.git'
    echo 'Pulling...' + env.BRANCH_NAME
    checkout scm
}
return this
