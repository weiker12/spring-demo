pipeline {
  agent any
  stages {
    stage('Git') {
       steps {
         echo "Git"
         dir('/Users/zhengshangchao/workplace/github/spring-demo') {
             git 'https://github.com/weiker12/spring-demo.git'
         }
       }
    }
    stage('Build') {
      steps {
         echo "Build"
         dir('/Users/zhengshangchao/workplace/github/spring-demo') {
             sh 'mvn clean install'
         }
      }
    }
    stage('Ready') {
      steps {
         echo "Ready"
         dir('/Users/zhengshangchao/workplace/github/spring-demo') {
             sh 'cp ./target/spring-demo-0.0.1-SNAPSHOT.jar ./spring-demo-0.0.1-SNAPSHOT.jar'
         }
      }
    }
    stage('Deploy') {
      agent any
      steps {
        echo 'Deploying'
        dir('/Users/zhengshangchao/workplace/github/spring-demo') {
             sh './deploy_jenkins.sh'
        }
      }
    }
  }
}
