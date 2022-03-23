def call() {
    pipeline {
      agent any
      stages {
        stage('Building Node app') {
          steps {
            echo "Building"
          }
        }
        stage('Testing Node app') {
          steps {
            echo "Testing"
          }
        }
        stage('Deploying to test') {
          steps {
            echo "Deploying"
          }
        }
      }
    }
}