def call(String launchTemplateId, String amiId) {

  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()

    def defaultVersion = readJSON text: sh(script: launchTemplate.getDefaultVersion(launchTemplateId), returnStdout: true).trim()

    println "Retrieved default version of launch template: ${defaultVersion[-1]}"

    def output = sh(script: launchTemplate.createVersion(launchTemplateId, defaultVersion[-1], amiId), returnStdout: true).trim()

    println "Created a new version of launch template ${defaultVersion[0]}"

    def jsonOutput = readJSON text: output

    def versionNumber = jsonOutput.LaunchTemplateVersion.VersionNumber

  sh launchTemplate.modifyLaunchTemplate(launchTemplateId, versionNumber)
  println "Successfully set default version ${versionNumber} for launch template ${defaultVersion[0]}."

  return launchTemplateId
}
