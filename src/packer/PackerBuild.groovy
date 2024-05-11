package packer

class PackerBuild {
  String packerFile
    PackerBuild(packerFile) {
      this.packerFile = packerFile
    }

  def init() {
      sh 'packer init .'
    }

  def build(){
    init()
    sh "packer build ${packerFile}"

  }
}
