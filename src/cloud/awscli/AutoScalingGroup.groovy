package cloud.awscli


class AutoScalingGroup {
  String name
    String client

    AutoScalingGroup(name, client) {
      this.name = name
        this.client = client

    }
  def describeInstances() {
    return "aws ec2 describe-instances ${name} and ${client}"
  }

}

