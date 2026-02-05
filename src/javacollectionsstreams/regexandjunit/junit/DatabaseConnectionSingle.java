package javacollectionsstreams.regexandjunit.junit;

public class DatabaseConnectionSingle {

    boolean connected = false;

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }

    public static void main(String[] args) {
        DatabaseConnectionSingle db = new DatabaseConnectionSingle();

        db.connect();
        System.out.println("Connected Test: " + db.connected);

        db.disconnect();
        System.out.println("Disconnected Test: " + !db.connected);
    }
}
