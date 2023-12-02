# Network Port Scanner GUI using Java

This Java application provides a sophisticated graphical user interface (GUI) for scanning open ports on a target system within a network. The GUI version enhances user interaction and offers a visually intuitive way to configure, initiate, and view the results of port scans.

## Features

### 1. Target Host Input
Enter the target host, which can be an IP address or a domain name. This is the system you want to scan for open ports.

### 2. Port Range Configuration
Specify the range of ports to scan by entering the start and end port numbers. This flexibility allows users to narrow down or broaden the scope of the scan.

### 3. Scan Initiation
Initiate the port scanning process through an easy-to-use graphical interface. Simply click the "Scan" button to begin the scan.

### 4. Real-time Results Display
View the scan results in real-time within the graphical interface. Open ports are highlighted, providing instant feedback on the status of each port.

### 5. User-friendly Interface
Leveraging JavaFX, the GUI provides an aesthetically pleasing and intuitive user experience, making it accessible for users of all levels.

### 6. Error Handling
The GUI version includes robust error handling to gracefully manage situations where a connection cannot be established to a specific port, ensuring a smooth user experience.

### 7. Timeout Mechanism
Each port connection attempt includes a timeout mechanism, preventing the application from hanging on unresponsive ports and improving the overall scanning efficiency.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK):** Ensure that you have the Java Development Kit installed on your system.

### Usage

1. **Launch the GUI:**
   - Execute the compiled Java program to launch the GUI version of the Network Port Scanner.

2. **Configure Scan Parameters:**
   - Enter the target host, start port, and end port in their respective text fields.

3. **Initiate Port Scan:**
   - Click the "Scan" button to start the scanning process.

4. **View Results:**
   - Results will be displayed in the text area, providing detailed information about open ports.

5. **Interpret Results:**
   - Analyze the results to identify open ports and understand the status of the scanned network.

## Contributing

Contributions are welcome! If you have suggestions for improvements, feature requests, or would like to report issues, feel free to [create an issue](https://github.com/Pranav-Amin-10/NetworkPortScannerGUI/issues) or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
