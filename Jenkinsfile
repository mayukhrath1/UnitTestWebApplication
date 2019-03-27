pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn test package'
      }
    }
    stage('docker_build') {
      steps {
        sh 'docker build -t mavendocker:latest .'
      }
    }
    stage('push image') {
      steps {
        sh '''docker login -u="1234567abcdefg" -p="Narayan@15"
docker tag mavendocker 1234567abcdefg/mavendocker:latest
docker push 1234567abcdefg/mavendocker'''
      }
    }
    stage('sqltest') {
      steps {
        sh 'mysql -hlocalhost -t -v -uroot -pabc123 -Dtest_db < "/home/abzooba/.jenkins/workspace/MavenDockerApp_master/testclear.sql"'
      }
    }
  }
}