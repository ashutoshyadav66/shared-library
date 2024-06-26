package org.opstree.cloud.awscli.ec2

class AutoScalingGroup {
    String asgName
    AutoScalingGroup(String asgName){
        this.asgName =asgName 
      }

      def startInstanceRefresh(
        int warmUpTime = 300,
        int minHealthyPercentage = 100,
        int maxHealthyPercentage = 200
         ){
          return """
            aws autoscaling start-instance-refresh \\
            --auto-scaling-group-name ${asgName} \\
            --preferences '{"InstanceWarmup": ${warmUpTime}, "MinHealthyPercentage": ${minHealthyPercentage}, "MaxHealthyPercentage": ${maxHealthyPercentage}}'
          """
        }
  }
