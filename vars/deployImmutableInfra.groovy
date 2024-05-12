def call() {
  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()
    def output = sh(script: launchTemplate.createVersion("lt-0be196a4ebe44a88b", "10", "ami-0c1e8a55e8ea6420f"), returnStdout: true).trim()
    def jsonOutput = readJSON text: output
    def versionNumber = jsonOutput.LaunchTemplateVersion.VersionNumber
  sh launchTemplate.modifyLaunchTemplate("lt-0be196a4ebe44a88b", versionNumber)
}
