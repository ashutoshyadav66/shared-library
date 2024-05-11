package packer

class PackerBuild {
    String packerFile
    
    PackerBuild(String packerFile) {
        this.packerFile = packerFile
    }

    def init() {
        script {
            sh "packer init ."
        }
    }

    def build() {
        init()
        script {
            sh "packer build ${packerFile}"
        }
    }
}

