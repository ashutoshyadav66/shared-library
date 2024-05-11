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
    if (config_dir != null) {
      return "cd ${config_dir} && packer build ${config_file}"
    } else {
      return "packer build ${config_file}"
    }
  }
}

