import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReportTemplate implements Cloneable {

    private String title;
    private String footer;
    private List<String> sections;

    public ReportTemplate(String title, String footer) {
        this.title = title;
        this.footer = footer;
        this.sections = new ArrayList<>();
    }

    public void setTitle(String title) {this.title = title;}
    public void setFooter(String footer) {this.footer = footer;}
    public void addSection(String section) {sections.add(section);}
        
    @Override
    public String toString() {
        return "Title: " + title + "\nFooter: " + footer + "\nSections: " + sections;
    }

    @Override
    public ReportTemplate clone() {
        try {
            ReportTemplate cloned = (ReportTemplate) super.clone();
            cloned.sections = new ArrayList<>(this.sections);
            return cloned; 
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }
}
