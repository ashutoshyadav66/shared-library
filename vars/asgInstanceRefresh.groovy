def call(String asgId){
    def asg = new org.opstree.cloud.awscli.ec2.AutoScalingGroup(asgId)
    asg.startInstanceRefresh()
  }
