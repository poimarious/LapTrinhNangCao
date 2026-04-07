import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Integer> mp = new HashMap<>();
    
    public void analyze(String content) {
        String text = content.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");
        
        for(String w : words) {
            if(w.isEmpty()) continue;

            if(mp.containsKey(w)) mp.put(w, mp.get(w) + 1);
            else mp.put(w, 1);
        } 
    } 

    

    public void displayResult() {

        System.out.println("Danh sach cac tu - so luong:");
        
        String most = "";
        int mx = 0;

        for(Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            if(entry.getValue() > mx) {
                mx = entry.getValue();
                most = entry.getKey();
            }
        }
        

        System.out.println("Tu xuat hien nhieu nhat : " + most + " - " + mx + " lan");
    }
    
}
