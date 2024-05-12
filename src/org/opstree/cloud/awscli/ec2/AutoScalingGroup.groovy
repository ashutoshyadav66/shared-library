package org.opstree.cloud.awscli.ec2

class AutoScalingGroup {
    String asgName
    AutoScalingGroup(String asgName){
        this.asgName =asgName 
      }

      def startInstanceRefresh(){
          return """
            aws autoscaling start-instance-refresh \\
            --auto-scaling-group-name ${asgName} \\
          """
        }
  }
