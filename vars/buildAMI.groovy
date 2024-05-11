def call() {
  def packer = new packer.PackerBuild()
  sh packer.build()
  }
