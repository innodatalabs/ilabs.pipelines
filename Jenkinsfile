def callMe = evaluate readTrusted('lib1/vars/callMe.groovy')

pipeline {
  agent { node { label 'master'}}
  properties {
    string(name: 'test', defaultValue: '')
  }
  stages {
    stage ("Example") {
      steps {
        script {
          def x = load('lib1/vars/callMe.groovy')
          x.foo('hoho')
        }
        script {
          // callMe("Mike")
          echo "${callMe}"
          callMe.boo('down here')
        }


      }
    }
  }
}