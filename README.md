# CS441-CloudSimulator
CS 441: Engineering Distributed Objects for Cloud Computing

Description: Create cloud simulators for evaluating executions of applications in cloud datacenters with different characteristics and deployment models.

Name - Shaik Muhammed Adeem.

INSTRUCTIONS  -

Development Environment - 

The assignment was developed using the following environment:

OS: macOs Big Sur
IDE: IntelliJ IDEA Ultimate 2021.2.2
Scala Version - Scala 3.0

Running the Application - 

	- This assignment needs some pre-requisites i.e. Simple Build Toolkit(SBT)
	- You can download the ZIP folder or clone the repository .
	- To run the project use the Command line - 'sbt clean compile run'.
  
Program overview - 

	- When you execute the program, you'll see the options below. To perform the desired simulations, select one of the choices.
	
 1  --> Simulation example     
 2  --> PaaS Simulation         
 3  --> SaaS Simulation 
	
	- Result of Simulation 1 - 

15:22:25.919 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 0 has been allocated to Host 0/DC 1
15:22:25.924 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 1 has been allocated to Host 1/DC 1
15:22:25.925 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 2 has been allocated to Host 2/DC 1
15:22:25.927 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 3 has been allocated to Host 3/DC 1
15:22:25.929 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 4 has been allocated to Host 4/DC 1
15:22:25.931 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 5 has been allocated to Host 5/DC 1
15:22:25.934 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 6 has been allocated to Host 6/DC 1
15:22:25.935 [run-main-0] INFO  VmAllocationPolicyAbstract - 0.00: VmAllocationPolicyFirstFit: Vm 7 has been allocated to Host 7/DC 1

	
                                         SIMULATION RESULTS

Cloudlet|Status |DC|Host|Host PEs |VM|VM PEs   |CloudletLen|CloudletPEs|StartTime|FinishTime|ExecTime
      ID|       |ID|  ID|CPU cores|ID|CPU cores|         MI|  CPU cores|  Seconds|   Seconds| Seconds
-----------------------------------------------------------------------------------------------------
       0|SUCCESS| 1|   0|        6| 0|        2|      10000|          2|        0|        40|      40
       8|SUCCESS| 1|   0|        6| 0|        2|      10000|          2|        0|        40|      40
      16|SUCCESS| 1|   0|        6| 0|        2|      10000|          2|        0|        40|      40
      24|SUCCESS| 1|   0|        6| 0|        2|      10000|          2|        0|        40|      40
       1|SUCCESS| 1|   1|        6| 1|        2|      10000|          2|        0|        40|      40
       9|SUCCESS| 1|   1|        6| 1|        2|      10000|          2|        0|        40|      40
      17|SUCCESS| 1|   1|        6| 1|        2|      10000|          2|        0|        40|      40
      25|SUCCESS| 1|   1|        6| 1|        2|      10000|          2|        0|        40|      40
       2|SUCCESS| 1|   2|        6| 2|        2|      10000|          2|        0|        40|      40
      10|SUCCESS| 1|   2|        6| 2|        2|      10000|          2|        0|        40|      40
      18|SUCCESS| 1|   2|        6| 2|        2|      10000|          2|        0|        40|      40
      26|SUCCESS| 1|   2|        6| 2|        2|      10000|          2|        0|        40|      40
       3|SUCCESS| 1|   3|        6| 3|        2|      10000|          2|        0|        40|      40
      11|SUCCESS| 1|   3|        6| 3|        2|      10000|          2|        0|        40|      40
      19|SUCCESS| 1|   3|        6| 3|        2|      10000|          2|        0|        40|      40
      27|SUCCESS| 1|   3|        6| 3|        2|      10000|          2|        0|        40|      40
       4|SUCCESS| 1|   4|        6| 4|        2|      10000|          2|        0|        40|      40
      12|SUCCESS| 1|   4|        6| 4|        2|      10000|          2|        0|        40|      40
      20|SUCCESS| 1|   4|        6| 4|        2|      10000|          2|        0|        40|      40
      28|SUCCESS| 1|   4|        6| 4|        2|      10000|          2|        0|        40|      40
       5|SUCCESS| 1|   5|        6| 5|        2|      10000|          2|        0|        40|      40
      13|SUCCESS| 1|   5|        6| 5|        2|      10000|          2|        0|        40|      40
      21|SUCCESS| 1|   5|        6| 5|        2|      10000|          2|        0|        40|      40
      29|SUCCESS| 1|   5|        6| 5|        2|      10000|          2|        0|        40|      40
       6|SUCCESS| 1|   6|        6| 6|        2|      10000|          2|        0|        40|      40
      14|SUCCESS| 1|   6|        6| 6|        2|      10000|          2|        0|        40|      40
      22|SUCCESS| 1|   6|        6| 6|        2|      10000|          2|        0|        40|      40
      30|SUCCESS| 1|   6|        6| 6|        2|      10000|          2|        0|        40|      40
       7|SUCCESS| 1|   7|        6| 7|        2|      10000|          2|        0|        40|      40
      15|SUCCESS| 1|   7|        6| 7|        2|      10000|          2|        0|        40|      40
      23|SUCCESS| 1|   7|        6| 7|        2|      10000|          2|        0|        40|      40
      31|SUCCESS| 1|   7|        6| 7|        2|      10000|          2|        0|        40|      40


	
	- The Simulation example demonstrate how a VM allocation policies affect VM assignment to hosts and, as a result, cloudlet scheduling. First Fit allocation strategy seeks to assign a VM to the First Host that meets the VM's needs. Once a VM has been assigned to a host, the process moves on to the next host to assign the next VM. As a result, the inactive host gets activated, increasing the datacenter's power usage. 

PaaS Simulation (Platform as a Service) - 

	- In PaaS, cloud users can create, deploy and fully control their applications, and cloud providers supply API calls that the cloud users incorporate into their applications to access and manipulate resources in the cloud. The cloud infrastructure is responsible for provisioning resources to applications and for providing interfaces with API calls to interact with resources and other applications .
	
	- This class simulates the PaaS (Platform as a Service) implementation. The cloudlets are assigned to the Datacenter based on the user's requirements. There are three datacenters in the current implementation, each with its own hardware and software specifications and cost. The cloudlet represents the software application or web service that the user wishes to run on the virtual machine. The user selects a service provider based on their needs and budget. If the chosen datacenter can accommodate the VM and Cloudlets, the service provider assigns the cloudlets there. The config file can be used to specify PaaS Cloudlet configuration. 
	
|-----------------------------------------------------------------------------------------------------------------------|
| Datacenter | VM Architecture | Cost Per Second($) | Cost Per Memory($) | Cost Per Storage($) | Cost Per Bandwidth($) |
|----------------------------------------------------------------------------------------------------------------------|
| 1          | Linux x86       | 0.05               | 2.35               | 1.4                 | 0.5                   |
| 2          | MacOS           | 1.0                | 0.04               | 0.86                | 0.45                  |
| 3          | Windows 10      | 0.1                | 1.25               | 0.08                | 0.56                  |
| 4          | MacOS           | 1.5                | 0.08               | 1.36                | 0.85                  |
 
Choose the Datacenter for allocating the task 
Choose from Options - 1, 2, 3, 4
2

                                                                     SIMULATION RESULTS

Cloudlet|Status |DataCenter|Host|Host Pes |VM|VM Pes   |CloudletLength|CloudletPes|StartTime|FinishTime|ExecTime|Cost Per Second|Cost Per Bandwidth|Total Cost
      ID|       |        ID|  ID|CPU cores|ID|CPU cores|            MI|  CPU cores|  Seconds|   Seconds| Seconds|              $|                 $|         $
--------------------------------------------------------------------------------------------------------------------------------------------------------------
       0|SUCCESS|         2|   0|        6| 0|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       8|SUCCESS|         2|   0|        6| 0|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      16|SUCCESS|         2|   0|        6| 0|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      24|SUCCESS|         2|   0|        6| 0|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       1|SUCCESS|         2|   1|        6| 1|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       9|SUCCESS|         2|   1|        6| 1|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      17|SUCCESS|         2|   1|        6| 1|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      25|SUCCESS|         2|   1|        6| 1|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       2|SUCCESS|         2|   2|        6| 2|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      10|SUCCESS|         2|   2|        6| 2|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      18|SUCCESS|         2|   2|        6| 2|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      26|SUCCESS|         2|   2|        6| 2|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       3|SUCCESS|         2|   3|        6| 3|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      11|SUCCESS|         2|   3|        6| 3|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      19|SUCCESS|         2|   3|        6| 3|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      27|SUCCESS|         2|   3|        6| 3|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       4|SUCCESS|         2|   4|        6| 4|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      12|SUCCESS|         2|   4|        6| 4|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      20|SUCCESS|         2|   4|        6| 4|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      28|SUCCESS|         2|   4|        6| 4|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       5|SUCCESS|         2|   5|        6| 5|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      13|SUCCESS|         2|   5|        6| 5|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      21|SUCCESS|         2|   5|        6| 5|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      29|SUCCESS|         2|   5|        6| 5|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       6|SUCCESS|         2|   6|        6| 6|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      14|SUCCESS|         2|   6|        6| 6|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      22|SUCCESS|         2|   6|        6| 6|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      30|SUCCESS|         2|   6|        6| 6|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
       7|SUCCESS|         2|   7|        6| 7|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      15|SUCCESS|         2|   7|        6| 7|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      23|SUCCESS|         2|   7|        6| 7|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
      31|SUCCESS|         2|   7|        6| 7|        2|         10000|          2|        0|        40|      40|         1.0000|            0.4500|  310.1200
--------------------------------------------------------------------------------------------------------------------------------------------------------------




SaaS Simulation (Software as a Service) - 

	- In SaaS, cloud users can create accounts, create, edit, save, and share text documents and spread- sheets. The underlying cloud infrastructure is invisible to users, since they connect to the document system’s portal and use software applications to manage the documents. Thus, users have access only to the interfaces exposed by the applications that are deployed in the cloud, not to the underlying cloud.
	
	- This class demonstrates the use of Software as a Service. The simulation depicts a data transport application  The service is used by Cloudlets to transmit packets between two VMs on two separate hosts. This application is exclusively invoked by the user, who has no control over the internal hardware or software specifications. 


	                                         SIMULATION RESULTS

Cloudlet|Status |DC|Host|Host PEs |VM|VM PEs   |CloudletLen|CloudletPEs|StartTime|FinishTime|ExecTime
      ID|       |ID|  ID|CPU cores|ID|CPU cores|         MI|  CPU cores|  Seconds|   Seconds| Seconds
-----------------------------------------------------------------------------------------------------
       0|SUCCESS| 1|   1|        6| 1|        2|       8000|          1|        0|         8|       8
       1|SUCCESS| 1|   2|        6| 2|        2|       8000|          1|        0|        16|      16
-----------------------------------------------------------------------------------------------------


	




				

