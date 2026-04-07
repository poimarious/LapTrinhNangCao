public class Main {
	public static void main(String[] args) {

        Report data = new Report("Hello", "World");

        ReportFormatter rF = new JsonFormatter();
        ReportService rS = new ReportService();

        System.out.println(rS.export(rF, data));
        System.out.println("\nXML: ");
        rF = new XmlFormatter();
        System.out.println(rS.export(rF, data));

	}
 }
