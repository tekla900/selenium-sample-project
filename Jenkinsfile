pipeline {
  agent any
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