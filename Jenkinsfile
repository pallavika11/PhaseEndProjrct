pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Containerize') {
            steps {

    
                sh "docker build -t myapp ."

                echo 'Containerizing the App with Docker'
            }
        }
        stage('Deploy') {
    steps {
        script {
            
            echo 'Deploy the App with Docker'
        }
    }
}
        
    }
}