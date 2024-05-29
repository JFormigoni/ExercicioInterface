public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("log.txt");

        consoleLogger.debug("This is a debug message");
        consoleLogger.warning("This is a warning message");
        consoleLogger.error("This is an error message");

        fileLogger.debug("This is a debug message");
        fileLogger.warning("This is a warning message");
        fileLogger.error("This is an error message");
    }
}