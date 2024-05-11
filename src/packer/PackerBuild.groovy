package packer

class PackerBuild {
  String packerFile

    PackerBuild(String packerFile) {
      this.packerFile = packerFile
    }

  def init(String dir) {
    if (dir != null) {
      return "packer init ${dir}"
    } else {
      return "packer init ."
    }
  }

  def build() {
    return "packer build ${packerFile}"
  }
}

