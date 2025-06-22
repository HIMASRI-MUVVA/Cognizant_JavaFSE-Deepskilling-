public class Logger {
    // Step 2: Static variable to hold one instance of Logger
    private static Logger instance;

    // Step 1: Private constructor to prevent outside instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to return the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Create instance if it doesn't exist
        }
        return instance;             // Return the single instance
    }

    // Example method to simulate logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
