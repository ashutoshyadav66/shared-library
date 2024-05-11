def call() {
  def packer = new packer.PackerBuild('cocktails.pkr.hcl')
  def config_file = 'intro-to-packer/cocktails.pkr.hcl'
  sh packer.init(config_file)
  sh packer.build(config_file)
  }
