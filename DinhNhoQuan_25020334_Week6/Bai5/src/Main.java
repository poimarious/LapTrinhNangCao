public class Main {
	public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        log1.log("Checking Singleton");
        System.out.println("check same: " + (log1 == log2));

        ExportFactory factory = new PdfFactory();
        Export exporter = factory.createExport();
        exporter.export();

        OldPlayer oldPlayer = new OldPlayer();
        Player modernPlayer = new PlayerAdapter(oldPlayer);
        modernPlayer.play("music.mp3");

        AppConfig cf1 = new AppConfig();
        cf1.setSetting("Theme", "Dark");
        AppConfig cf2 = cf1.clone();
        cf2.setSetting("Theme", "Light");
        System.out.println("Origin: " + cf1);
        System.out.println("cf1 hash code: " + cf1.hashCode());
        System.out.println("Copy: " + cf2);
        System.out.println("cf2 hash code: " + cf2.hashCode());
	}
 }
