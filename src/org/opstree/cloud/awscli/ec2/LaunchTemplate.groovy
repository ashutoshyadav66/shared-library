package org.opstree.cloud.awscli.ec2

class LaunchTemplate {
  String launchTemplateId

  LaunchTemplate(String launchTemplateId){
      this.launchTemplateId = launchTemplateId
    }

  def createVersion(int sourceVersion, String amiId) {
    if (sourceVersion == null) {
      return """
        aws ec2 create-launch-template-version \\
        --launch-template-id ${launchTemplateId} \\
        --launch-template-data '{"ImageId": "${amiId}"}'
        """
    } else {
      return """
        aws ec2 create-launch-template-version \\
        --source-version ${sourceVersion} \\
        --launch-template-id ${launchTemplateId} \\
        --launch-template-data '{"ImageId": "${amiId}"}'
        """

    }
  }

  def modifyLaunchTemplate(int defaultVersion) {

    return """
      aws ec2 modify-launch-template \\
      --launch-template-id ${launchTemplateId} \\
      --default-version ${defaultVersion}
    """
  }

  def getDefaultVersion(){

    return """
      aws ec2 describe-launch-template-versions --launch-template-id  ${launchTemplateId} \\
      --query 'LaunchTemplateVersions[?DefaultVersion == `true`].[LaunchTemplateName,LaunchTemplateId,VersionNumber][]'
      """
  }
}

