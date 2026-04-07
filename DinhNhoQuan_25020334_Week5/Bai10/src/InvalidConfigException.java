

public class InvalidConfigException extends Exception {

    public InvalidConfigException(String msg) {
        super("Invalid config:"  + msg);
    }
}
