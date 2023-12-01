import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

// Entry point for the application
public class NetworkPortScannerGUI {
    public static void main(String[] args) {
        // Execute the GUI creation on the event dispatch thread
        SwingUtilities.invokeLater(NetworkPortScanner::createAndShowGUI);
    }
}

// The main class representing the network port scanner
class NetworkPortScanner extends JFrame {
    private JTextField hostField;        // Text field for entering the target host
    private JTextField startPortField;   // Text field for entering the starting port
    private JTextField endPortField;     // Text field for entering the ending port
    private JTextArea resultArea;        // Text area for displaying scan results

    // Constructor for the network port scanner GUI
    NetworkPortScanner() {
        setTitle("Network Port Scanner");            // Set the title of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on window close
        setLayout(new BorderLayout());               // Set the layout manager to BorderLayout
        setPreferredSize(new Dimension(400, 400));   // Set the preferred size of the window

        // Create an input panel with a 4x2 grid layout
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        hostField = new JTextField("localhost");     // Set the default host to "localhost"
        startPortField = new JTextField("1");        // Set the default starting port to "1"
        endPortField = new JTextField("1024");       // Set the default ending port to "1024"
        resultArea = new JTextArea();                // Create a text area for displaying results

        JButton scanButton = new JButton("Scan Ports");  // Create a button for starting the scan
        scanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scanPorts(); // Register an ActionListener for the button
            }
        });

        // Add components to the input panel
        inputPanel.add(new JLabel("Target Host:"));
        inputPanel.add(hostField);
        inputPanel.add(new JLabel("Start Port:"));
        inputPanel.add(startPortField);
        inputPanel.add(new JLabel("End Port:"));
        inputPanel.add(endPortField);

        // Create a sub-panel for the button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(scanButton);
        scanButton.setPreferredSize(new Dimension(100, 30)); // Set the button size

        // Add components to the main frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); // Place the button panel at the bottom

        pack(); // Pack the components for a compact layout
    }

    // Method for scanning ports based on user input
    private void scanPorts() {
        String host = hostField.getText();
        int startPort = Integer.parseInt(startPortField.getText());
        int endPort = Integer.parseInt(endPortField.getText());

        // Display a message indicating the start of the scan
        resultArea.setText("Scanning ports on host " + host + " from " + startPort + " to " + endPort + "...\n");

        // Loop through the specified range of ports and attempt to connect to each
        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket(host, port);
                resultArea.append("Port " + port + " is open\n"); // If connection succeeds, the port is open
                socket.close(); // Close the socket
            } catch (IOException e) {
                // If an IOException occurs, the port is closed or unreachable
            }
        }
    }

    // Static method to create and display the GUI
    public static void createAndShowGUI() {
        NetworkPortScanner scanner = new NetworkPortScanner();
        scanner.setVisible(true); // Set the visibility of the main frame to true
    }
}


/*

* Verify Open Ports using CMD

1) Open the Command Prompt. ...
2) Type “netstat -aon” and hit enter.
3) Look for the port numbers in the Listening state. ...

Filters:

* To sort by "LISTENING" ports:

    netstat -ano | find "LISTENING" | sort

* To sort by "ESTABLISHED" ports:

    netstat -ano | find "ESTABLISHED" | sort

* To sort by "TIME_WAIT" ports:

    netstat -ano | find "TIME_WAIT" | sort

*/
