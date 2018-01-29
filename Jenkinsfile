def callMe = evaluate readTrusted('lib1/vars/callMe.groovy')
node self {
  def callMe2 = load 'lib1/vars/callMe.groovy'
}

pipeline {
  agent { node { label 'master'}}
  parameters {
    string(name: 'test', defaultValue: '', description: 'something to test')
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