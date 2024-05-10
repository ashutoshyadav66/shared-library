package awscli.asg

class HelloWorld {
    private String privatestr

    def callInnerMethod() {
        new Inner().methodA()
    }
    
    class Inner {
        def methodA() {
            println privatestr
        }
    }
}
