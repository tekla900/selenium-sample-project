pipeline {
  agent any
   tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
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
