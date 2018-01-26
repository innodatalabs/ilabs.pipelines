def call(message) {
  echo "Hello, ${message}."
}

def delegate(Map opt) {
  pipeline {
    agent none
    parameters {
      string(name: 'PARAM_1', defaultValue: "${opt.test}", description: 'testing')
    }
    stages {
      stage ('Root') {
        steps {
          echo "root! ${params.PARAM_1}"
        }
      }
    }
  }
}

return this