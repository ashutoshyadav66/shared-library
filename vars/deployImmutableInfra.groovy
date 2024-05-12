def call() {
    def launchTemplate = new LaunchTemplate()
    sh launchTemplate.createVersion("lt-0be196a4ebe44a88b", "ami-0c1e8a55e8ea6420f")

  }
