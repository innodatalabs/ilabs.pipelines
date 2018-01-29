def call(message) {
  echo "Hello, ${message}."
}

def delegate(Map opt) {
  pipeline {
    agent none
    stages {
      stage ('Root') {
        steps {
          echo "root!"
        }
      }
    }
  }
}

return this