pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh 'mvn test package'
          }
        }
        stage('Sonar_scan') {
          steps {
            sh '''withSonarQubeEnv(\'Sonar_service\') {
             sh \'mvn clean package sonar:sonar\'
                    }'''
            }
          }
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
          sh 'mysql -hlocalhost -t -v -uroot -pabc123 -Dtest_db < "/home/abzooba/.jenkins/workspace/UnitTestWebApplication_master/testclear.sql"'
        }
      }
    }
    post {
      always {
        junit '**/target/surefire-reports/*.xml'

      }

    }
  }