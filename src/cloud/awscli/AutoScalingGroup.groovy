package cloud.awscli


class AutoScalingGroup {
  String name
    String client
    String location

    AutoScalingGroup(name, client) {
      this.name = name
        this.client = client

    }
    def test(){
        return 'ls'
      }
  def describeInstances() {
    return "aws ec2 describe-instances ${name} and ${client} ${location}"
  }

}

