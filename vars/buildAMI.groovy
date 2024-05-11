def call() {
  def packer = new packer.PackerBuild()
    def config_dir = 'intro-to-packer'
    def config_file = 'cocktails.pkr.hcl'
    sh packer.init(config_dir)
    def output = sh(script: packer.build(config_dir, config_file), returnStdout: true).trim()
    echo "Output of asg.test(): ${output}"
  }
