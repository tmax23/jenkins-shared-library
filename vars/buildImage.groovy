#!/usr/bin/env groovy

def call() {
	echo "Building docker image"
	withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
	     sh "docker build -t tmax23/java-maven-app:2.0 ."
	     sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
	     sh "docker push tmax23/java-maven-app:2.0"
  }
}
