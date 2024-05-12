package cloud.awscli.ec2

class LaunchTemplate {
    def createVersion(String launchTemplateId, String amiId) {
        return """
            aws ec2 create-launch-template-version \\
            --launch-template-id ${launchTemplateId} \\
            --launch-template-data '{"ImageId": "${amiId}"}'
        """
    }
}

