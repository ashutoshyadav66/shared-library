package packer

class PackerBuild {
    String packerFile
    class PackerBuild(packerFile) {
        this.packerFile = packerFile
      }

    def packerInit() {
         return "packer init ."
      }
    def build(){
        packerInit()

      }
  }
