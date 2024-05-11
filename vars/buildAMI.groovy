def call() {
  def packer = new packer.PackerBuild('cocktails.pkr.hcl')
  sh packer.init('intro-to-packer')
  sh packer.build()
  }
