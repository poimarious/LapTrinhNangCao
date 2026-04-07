public class AppConfig {
    
    private String appName;
    private String version;
    private String logLevel;

    private AppConfig() {
        this.appName = "AuctionSystem";
        this.version = "1.0.0";
        this.logLevel = "DEBUG";
    }

    private static class SingletonHelper {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return SingletonHelper.INSTANCE; 
    }

    public AppConfig setAppName(String name) {
        this.appName = name;
        return this;
    } 

    public AppConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public AppConfig setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public String getAppName() {return appName;}
    public String getVersion() {return version;}
    public String getLogLevel() {return logLevel;}

    @Override
    public String toString() {
        return "App Name: " + appName + " | Version: " + version + " | Log Level: " + logLevel; 
    }
}
