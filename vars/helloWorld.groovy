
def call() {
  def asg = new cloud.awscli.AutoScalingGroup('Ashutosh', 'pw')
    def output asg.describeInstances()
    println output

}

