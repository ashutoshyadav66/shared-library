def call() {
    def outer = new awscli.asg.HelloWorld()
    outer.privatestr = "Hello, Inner!"
    println outer.callInnerMethod()
}

