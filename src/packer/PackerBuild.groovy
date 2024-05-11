package packer

class PackerBuild {
  String packerFile
    PackerBuild(packerFile) {
      this.packerFile = packerFile
    }

  def packerInit() {
    return "packer init ."
  }
  def build(){
    packerInit()

  }
}
