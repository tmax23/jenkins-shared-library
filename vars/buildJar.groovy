#!/usr/bin/env groovy

def call() {
  echo "Building App for branch name: $BRANCH_NAME"
  sh 'mvn package'
}
