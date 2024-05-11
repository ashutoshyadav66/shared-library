def call() {
  def packer = new packer.PackerBuild()
  def config_file = 'intro-to-packer'
  def config_dir = 'cocktails.pkr.hcl'
  sh packer.init(config_file)
  sh packer.build(config_dir, config_file)
  }
