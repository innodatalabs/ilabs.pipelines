def call(message) {
  echo "Hello, ${message}."
}

def delegate(Map opt) {
  pipeline {
    agent none
    stages {
      stage ('Root') {
        steps {
          def opt_test = "Hello"
          echo "root! ${opt_test}"
        }
      }
    }
  }
}

return this