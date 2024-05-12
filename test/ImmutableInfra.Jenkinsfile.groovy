@Library('shared-library') _

def amiId

pipeline {
    agent any
    stages {
        stage('Build AMI with Packer') {
            steps {
               script {
                    amiId = buildAMI(
                        'intro-to-packer',
                        'cocktails.pkr.hcl'
                    )
               }
            }
        }
        stage('Update Launch Template') {
            steps {
                updateLaunchTemplate(
                    'lt-0be196a4ebe44a88b',
                    amiId
                )
            }
        }
    }
}

