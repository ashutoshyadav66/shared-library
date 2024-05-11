package packer

class PackerBuild {

  def init(String dir) {
    if (dir != null) {
      return "packer init ${dir}"
    } else {
      return "packer init ."
    }
  }

  def build(String config_file) {
    return "packer build ${config_file}"
  }
}

