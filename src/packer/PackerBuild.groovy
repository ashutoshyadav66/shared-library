package packer

class PackerBuild {
  String packerFile
    PackerBuild(packerFile) {
      this.packerFile = packerFile
    }

  def build(){
    return "packer build ${packerFile}"

  }
}
