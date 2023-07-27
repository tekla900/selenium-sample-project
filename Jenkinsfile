pipeline {
  agent any
   tools { 
        maven 'Maven 3.9.3' 
        jdk 'jdk9' 
    }
  stages {
    stage('Build Maven Project') {
      parallel {
        stage('Build Maven Project') {
          steps {
            sh '''mvn compile clean test
'''
          }
        }

        stage('Get Maven Version') {
          steps {
            sh 'mvn -v'
          }
        }

      }
    }

  }
}
