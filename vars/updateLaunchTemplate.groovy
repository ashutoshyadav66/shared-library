def call(String launchTemplateId, String amiId) {
  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()
    def defaultVersion = readJSON text: sh(script: launchTemplate.getDefaultVersion(launchTemplateId))
    println defaultVersion
    def output = sh(script: launchTemplate.createVersion(launchTemplateId, "10", amiId), returnStdout: true).trim()
    def jsonOutput = readJSON text: output
    def versionNumber = jsonOutput.LaunchTemplateVersion.VersionNumber
  sh launchTemplate.modifyLaunchTemplate(launchTemplateId, versionNumber)
}
