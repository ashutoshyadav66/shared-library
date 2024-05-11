def call() {
  def packer = new packer.PackerBuild('cocktails.pkr.hcl')
  sh packer.init()
  sh packer.build()
  }
