def callMe = library('@script/lib1/vars/callMe.groovy')

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