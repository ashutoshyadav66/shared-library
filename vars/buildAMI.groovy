def call(String config_dir, String config_file) {

  def packer = new org.opstree.packer.awsAMI()

    sh packer.init(config_dir)

    def output = sh(script: packer.build(config_dir, config_file), returnStdout: true)

    if (output.contains('amazon-ebs.cocktails: AMIs were created:')) {

        def lines = output.split('\n')
        def lastLine = lines[-1] 
        def amiId = lastLine.split(': ')[-1]
        def region = lastLine.split(': ')[0]

        println "Region: ${region}"
        println "Successfully created a new AMI with ID: ${amiId}."

        return amiId

    } else {
      echo "${output}"
        return 1
    }
}
