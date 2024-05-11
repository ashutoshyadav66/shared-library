package packer

class PackerBuild {
    String packerFile
    
    PackerBuild(String packerFile) {
        this.packerFile = packerFile
    }

    def init() {
            return "packer init ."
    }

    def build() {
            return "packer build ${packerFile}"
    }
}

