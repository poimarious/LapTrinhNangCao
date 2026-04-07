import java.util.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        String content = "JDK 26 is the latest release of the Java SE Platform; JDK 25 is the latest Long-Term Support (LTS) release of the Java SE Platform. JDK 21 is the previous Long-Term Support (LTS) release of the Java SE Platform.";
       
        String cleanText = content.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = cleanText.split("\\s+"); 

        Map<String, Integer> mp = new HashMap<>();

        for(String w : words) {
            if(w.isEmpty()) continue;
            
            if(mp.containsKey(w)) mp.put(w, mp.get(w) + 1);
            else mp.put(w, 1);
        }
        
        String most = "";
        int mx = 0;

        List <String > uniqueWords = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : mp.entrySet()) {

            if (entry.getValue() > mx) {
                mx = entry.getValue();
                most = entry.getKey();
            }

            if(entry.getValue() == 1) uniqueWords.add(entry.getKey());
        }

        System.out.println("So tu khac nhau : "  + mp.size());
        System.out.println("Tu xuat hien nhieu nhat : " + most + " - "  + mx + " lan");
        System.out.println(" Cac tu chi xuat hien dung 1 lan: ");
        System.out.println(uniqueWords);
	}
 }
