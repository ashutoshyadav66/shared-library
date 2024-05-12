// import groovy.json.JsonSlurper

def call() {
  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()
    def jsonSlurper = new JsonSlurper()
    def output = sh(script: launchTemplate.createVersion("lt-0be196a4ebe44a88b", "1", "ami-0c1e8a55e8ea6420f"), returnStdout: true).trim()
    println output
    // def data = jsonSlurper.parseText(output)
    // def versionNumber = data.LaunchTemplateVersion.VersionNumber
    // println "Version Number: ${versionNumber}"

}
