
pipeline {
  agent none
  stages {
    stage ("Example") {
      steps {
        script {
          def rootDir = pwd()
          def callMe = library("${rootDir}@script/lib1/vars/callMe.groovy")
          callMe("Mike")
        }
      }
    }
  }
}