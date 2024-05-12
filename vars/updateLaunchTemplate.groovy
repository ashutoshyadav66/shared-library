def call(String launchTemplateId, String amiId) {

  def launchTemplate = new cloud.awscli.ec2.LaunchTemplate()

    def defaultVersion = readJSON text: sh(script: launchTemplate.getDefaultVersion(launchTemplateId), returnStdout: true).trim()[-1]

    println "Default launch template version: ${defaultVersion}"

    def output = sh(script: launchTemplate.createVersion(launchTemplateId, defaultVersion, amiId), returnStdout: true).trim()

    println "Created new version of ${launchTemplateId}"

    def jsonOutput = readJSON text: output

    def versionNumber = jsonOutput.LaunchTemplateVersion.VersionNumber

  sh launchTemplate.modifyLaunchTemplate(launchTemplateId, versionNumber)
  println "Updated default launch template version to ${versionNumber}"
}
