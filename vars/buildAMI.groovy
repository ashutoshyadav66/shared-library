def call() {
  def packer = new packer.PackerBuild()
  def config_dir = 'intro-to-packer'
  def config_file = 'cocktails.pkr.hcl'
  sh packer.init(config_dir)
  def reponse = sh packer.build(config_dir, config_file)

  println 'Printing response'
  println response
  }
