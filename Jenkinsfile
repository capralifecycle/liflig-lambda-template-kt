#!/usr/bin/env groovy

// See https://github.com/capralifecycle/jenkins-pipeline-library
@Library("cals") _

buildConfig() {
  dockerNode {
    checkout scm

    insideToolImage("maven:3-jdk-11-debian", [insideArgs: "-e HOME"]) {
      withMavenSettings {
        stage('Build and Test project') {
          sh "mvn -s \$MAVEN_SETTINGS -B verify -U"
        }

        insideSonarScanner {
          analyzeSonarCloudForMaven([
            'sonar.organization': 'capralifecycle',
            'sonar.projectKey': 'capralifecycle_liflig-lambda-template-kt',
          ])
        }
      }
    }
  }
}

