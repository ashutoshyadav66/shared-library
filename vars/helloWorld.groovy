def call() {
    def outer = new Outer()
    outer.privatestr = "Hello, Inner!"
    outer.callInnerMethod()
}

