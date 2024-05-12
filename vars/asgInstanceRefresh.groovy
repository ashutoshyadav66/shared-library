def call(String asgName){
    def asg = new org.opstree.cloud.awscli.ec2.AutoScalingGroup(asgName)
    sh asg.startInstanceRefresh()
  }
