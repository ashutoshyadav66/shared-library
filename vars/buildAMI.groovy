def call() {
  def packer = new packer.PackerBuild('cocktails.pkr.hcl')
  packer.build()
  }
