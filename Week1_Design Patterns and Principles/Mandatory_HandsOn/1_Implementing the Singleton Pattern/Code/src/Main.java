public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("\nOnly one instance created (logger1 == logger2)");
            System.out.println("Singleton Pattern implemented successfully");
        } else {
            System.out.println("\nSingleton implementation failed (logger1 != logger2)");
        }
    }
}
