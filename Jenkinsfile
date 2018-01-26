def rootDir = pwd()
def callMe = library("${rootDir}@script/lib1/vars/callMe.groovy")

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