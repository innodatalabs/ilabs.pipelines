def callMe = evaluate readTrusted('lib1/vars/callMe.groovy')

pipeline {
  agent { node { label 'master'}}
  stages {
    stage ("Example") {
      steps {
        script {
          def lib = load('lib1/vars/callMe.groovy')
          lib.boo()
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