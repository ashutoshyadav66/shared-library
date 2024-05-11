def call() {
    def asg = new cloud.awscli.AutoScalingGroup('Ashutosh', 'pw')
    def output = sh(script: asg.test(), returnStdout: true).trim()
    echo "Output of asg.test(): ${output}"
}

