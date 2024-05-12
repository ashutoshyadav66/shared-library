package org.opstree.cloud.awscli.ec2.AutoScalingGroup

class AutoScalingGroup {
    String asgId
    AutoScalingGroup(String asgId){
        this.asgId = asgId
      }

      def startInstanceRefresh(){
          return """
            aws autoscaling start-instance-refresh \\
            --auto-scaling-group-name ${asgId} \\
          """
        }
  }
