package cloud.awscli


class AutoScalingGroup {
    String name
    String client

    AutoScalingGroup(name, client) {
        this.name = name
        this.client = client

        def printMsg() {
          return 'hello from'+ name
          }
    }
}
