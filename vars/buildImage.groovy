#!/usr/bin/env groovy

def call(String imageName) {
	echo "Building docker image"
	withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
	     sh "docker build -t $imageName ."
	     sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
	     sh "docker push $imageName"
  }
}
