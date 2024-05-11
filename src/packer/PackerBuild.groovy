package packer

class PackerBuild {

  def init(String dir) {
    if (dir != null) {
      return "packer init ${dir}"
    } else {
      return "packer init ."
    }
  }

  def build(String config_dir, String config_file) {
    dir(config_dir) {
      return "packer build ${config_file}"
    }
  }
}

