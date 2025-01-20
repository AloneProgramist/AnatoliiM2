package module2;

public class ConfigFileDoesntNotExists extends RuntimeException {
    public ConfigFileDoesntNotExists(String message) {
        super(message);
    }
}
