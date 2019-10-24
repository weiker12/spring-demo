pipeline {
  agent any
  stages {
    stage('Git') {
       steps {
         echo "Git"
         git 'https://github.com/weiker12/spring-demo.git'
       }
    }
    stage('Build') {
      steps {
         echo "Build"
         sh 'mvn clean install'
      }
    }
    stage('Ready') {
      steps {
         echo "Ready"
         sh 'cp ./target/spring-demo-0.0.1-SNAPSHOT.jar ./spring-demo-0.0.1-SNAPSHOT.jar'
      }
    }
    stage('Deploy') {
      agent any
      steps {
        echo 'Deploying'
        sh './deploy_jenkins.sh'
      }
    }
  }
}
