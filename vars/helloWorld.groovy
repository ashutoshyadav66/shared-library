
def call() {
    def asg = new cloud.awscli.AutoScalingGroup('Ashutosh', 'pw')
    asg.describeInstances()
    
}

