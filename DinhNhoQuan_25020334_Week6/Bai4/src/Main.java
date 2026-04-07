import java.net.ProtocolException;

public class Main {

    public static void adapterMain() {
        int[] arr = {5, 1, 12 ,6 , 4, 2};

        LegacySorter old = new LegacySorter();
        Sorter sorter = new SorterAdapter(old);
        int[] ans = sorter.sort(arr);
        for(int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
        System.out.println();
    }

    public static void prototypeMain() {
        ReportTemplate t1 = new ReportTemplate("Report Template 1", "copyright 2026 - abc.");
        t1.addSection("section 1");

        ReportTemplate t2 = t1.clone();
        t2.setTitle("Report Template 2");
        t2.addSection("section 2.1");
        
        System.out.println(t1);
        System.out.println(t1.hashCode());
        System.out.println(t2);
        System.out.println(t2.hashCode());
    }

	public static void main(String[] args) {
	    adapterMain();
        prototypeMain();
    }
 }
