def call() {
  def packer = new packer.awsAMI()

    def config_dir = 'intro-to-packer'
    def config_file = 'cocktails.pkr.hcl'

    sh packer.init(config_dir)

    def output = sh(script: packer.build(config_dir, config_file), returnStdout: true)

    if (output.contains('amazon-ebs.cocktails: AMIs were created:')) {
        def lines = output.split('\n')
        def lastLine = lines[-1] 
        def amiId = lastLine.split(': ')[-1]
        println amiId

    } else {
      echo "${output}"
        return 1
    }
}
