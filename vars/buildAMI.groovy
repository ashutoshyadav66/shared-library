def call() {
  def packer = new packer.awsAMI()

    def config_dir = 'intro-to-packer'
    def config_file = 'cocktails.pkr.hcl'

    sh packer.init(config_dir)

    def output = sh(script: packer.build(config_dir, config_file), returnStdout: true).trim()

    if (output.contains('amazon-ebs.cocktails: AMIs were created:')) {
      def amiId = output =~ /(?<=AMIs were created:\n\w+: )ami-\w+/

        if (amiId) {
          echo "AMI ID: ${amiId[0]}"
        } else {
          echo "No AMI ID found."
        }
    } else {
      echo "Output does not contain 'amazon-ebs.cocktails: AMIs were created:'."
    } 
}
