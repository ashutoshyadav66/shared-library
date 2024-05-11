def call() {
  def packer = new packer.PackerBuild()
  def config_dir = 'intro-to-packer'
  def config_file = 'cocktails.pkr.hcl'
  sh packer.init(config_dir)
  sh packer.build(config_dir, config_file)
  }
