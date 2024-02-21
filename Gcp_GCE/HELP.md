step 1: create the spring boot project
step 2: do the maven install --> jar file is created inside the target folder
step 3: create a GCP project --> add the below firewall rule for the default vpc network/create my own customized vpc network and then inside that vpc nework add the below firewall rule --> create the VM instance and refer the customized vpc network.
How to create firewall rule--->
       a. Go inside the default vpc network/create my own vpc network
	   b. click on firewall --> add new firewall rule --> name the firewall rule --> choose the network where we want to apply this firewall rule --> under protocols and port choose specified protocols and port --> checkbox the TCP --> mention the ports(for eg: 8080,8080-9080)
step 4: go inside the folder where the springboot code is present (E:\GCP_SpringBoot_Git\GCP_SpringBoot\Gcp_GCE)
step 5: open the cmd --> gcloud auth login --> gcloud config set project PROJECT_ID --> 
                         gcloud compute scp target/<NameOfTheJarPresentInTheTargetFolder.jar> <NameOfTheVmInstanceCreated>:  --> to copy the jar from local system to the VM
step 6: open the VM instance using SSH connect 
       sayantan_chatz@springboot-helloworld-instance:~$ ls  --> to see list of files and folders
       sayantan_chatz@springboot-helloworld-instance:~$ pwd --> to see the current directory
	   sayantan_chatz@springboot-helloworld-instance:~$ sudo apt install openjdk-17 --> to install open jdk 17
	   sayantan_chatz@springboot-helloworld-instance:~$ java -version
	   sayantan_chatz@springboot-helloworld-instance:~$ cd ..
	   sayantan_chatz@springboot-helloworld-instance:/home$ ls
	   ACER  sayantan_chatz
	   sayantan_chatz@springboot-helloworld-instance:/home$ cd ACER
	   sayantan_chatz@springboot-helloworld-instance:/home/ACER$ ls
	   Gcp_GCE-0.0.1-SNAPSHOT.jar
	   sayantan_chatz@springboot-helloworld-instance:/home/ACER$ java -jar Helloworld.jar
	   sayantan_chatz@springboot-helloworld-instance:/home/ACER$ fuser -k 8080/tcp 8080/udp
	   
step 7: to run the application in the browser, hit the url with public external ip -- http://{External_Ip}:<portOfTheSpringBootApp>/<endpoint>