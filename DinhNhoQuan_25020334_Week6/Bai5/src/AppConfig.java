import java.util.HashMap;
import java.util.Map;

public class AppConfig implements Cloneable {

    private Map<String, String > settings = new HashMap<>();

    
    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    @Override
    public String toString() {
        return "Settings: " + settings;
    }

    @Override
    public AppConfig clone() {
        try {
            AppConfig cloned = (AppConfig) super.clone();
            cloned.settings = new HashMap<>(this.settings);
            return cloned;
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }

}
