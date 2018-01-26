def callMe = evaluate readTrusted('lib1/vars/callMe.groovy')

pipeline {
  agent none
  stages {
    stage ("Example") {
      steps {
        script {
          callMe("Mike")
        }
      }
    }
  }
}