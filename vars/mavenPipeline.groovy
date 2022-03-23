def call(int javaVersion) {
  if (javaVersion == 8) {
    pipeline {
      agent any
      stages {
        stage('Building Java > 8') {
          steps {
            echo "Building Java 8 app"
          }
        }
        stage('Testing Java > 8') {
          steps {
            echo "Testing Java 8 app"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Building Java 11') {
          steps {
            echo "Building Java 11 app"
          }
        }
        stage('Testing Java > 11') {
          steps {
            echo "Testing Java 11 app"
          }
        }
      }
    }
  }
}