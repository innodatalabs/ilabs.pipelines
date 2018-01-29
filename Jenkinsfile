def callMe = evaluate readTrusted('lib1/vars/callMe.groovy')

pipeline {
  agent { node { label 'master'}}
  stages {
    stage ("Example") {
      steps {
        script {
          def x = load('lib1/vars/callMe.groovy')
          x('hoho')
          x.boo()
        }
        script {
          // callMe("Mike")
          echo "${callMe}"
          callMe.boo()
        }


      }
    }
  }
}