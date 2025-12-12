package Oop;

public class Op5 {
    private String connectionString; 
    private boolean connected;  

    public Op5(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;    
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}