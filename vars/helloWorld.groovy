def call() {
    def outer = new awscli.asg.HelloWorld()
    outer.privatestr = "Hello, Inner!"
    outer.callInnerMethod()
}

