# NetworkPortScannerGUI

This is the GUI(Graphical User Interface) version of project.

### Description:<br>
NetworkPortScanner is a simple Java program that scans a specified range of ports on a target IP address to check for open ports. It utilizes socket connections to attempt a connection to each port and reports whether the port is open or closed. This can be useful for network administrators and security professionals to identify open ports on a system.

### Usage:<br>
🠮 Set Target IP Address: Replace the value of the ipAddress variable in the PortScanner.java file with the IP address of the target system.<br>
🠮 Specify Port Range: Adjust the values of startPort and endPort variables to define the range of ports to be scanned.<br>
🠮 Run the Program: Execute the main method in the PortScanner class.

### Note:<br>
The program uses a timeout of 1000 milliseconds for each connection attempt. The result will be displayed in the console, indicating whether each port is open or closed.


### Additional Information:<br>
🠮 Verify Open Ports using CMD<br>
🠮 Open the Command Prompt.<br>
🠮 Type netstat -aon and hit enter.<br>
🠮 Look for the port numbers in the Listening state.<br>

### Filters for CMD Verification:<br>
🠮 netstat -ano | find "LISTENING" | sort        - To sort by "LISTENING" ports<br>
🠮 netstat -ano | find "ESTABLISHED" | sort      - To sort by "ESTABLISHED" ports<br>
🠮 netstat -ano | find "TIME_WAIT" | sort        - To sort by "TIME_WAIT" ports<br>
