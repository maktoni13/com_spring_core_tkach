package comspring;

/**
 * Hello world!
 */
public class App {

    private static final String ID = "1";
    private static final String FULL_NAME = "John Smith";
    public static final String MSG = "Some event for user 1";

    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client(ID, FULL_NAME);
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent(MSG);
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }


}
