import groovy.json.JsonSlurper
def call() {
  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()
    def output = sh(script: launchTemplate.createVersion("lt-0be196a4ebe44a88b", "10", "ami-0c1e8a55e8ea6420f"), returnStdout: true).trim()
    def jsonSlurper = new JsonSlurper()
    def jsonObject = jsonSlurper.parseText(output)
    def launchTemplateId = jsonObject.LaunchTemplateVersion.LaunchTemplateId
    def versionNumber = jsonObject.LaunchTemplateVersion.VersionNumber
    sh launchTemplate.modifyLaunchTemplate(launchTemplateId, 15)
}
