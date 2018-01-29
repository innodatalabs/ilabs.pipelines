def call(message) {
  echo "Hello, ${message}."
}

def boo(something) {
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