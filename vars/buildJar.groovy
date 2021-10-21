#!/usr/bin/env groovy

def call() {
  echo "Building Jar App"
  sh 'mvn package'
}
