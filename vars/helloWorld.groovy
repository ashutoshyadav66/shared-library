
def call() {
  def asg = new cloud.awscli.AutoScalingGroup('Ashutosh', 'pw')
      sh asg.describeInstances()

}

