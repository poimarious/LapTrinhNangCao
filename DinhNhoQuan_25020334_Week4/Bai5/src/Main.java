public class Main {
	public static void main(String[] args) {
        Pair<String, Integer> age = new Pair<String, Integer>("Tuoi", 20);
        Pair<String, String> msv = new Pair<String, String>("Ma SV", "SV001");
        Pair<Integer,Double> coordinates = new Pair<Integer, Double>(105, 21.5);

        System.out.println(age);
        System.out.println(msv);
        System.out.println(coordinates);
	
        /*
        Pair<Integer, String> test = new Pair<Integer, String>("Ok", "?");
        error: incompatible types: String cannot be converted to Intege 

        Pair<Integer, String> test=  new Pair<String, String>("OK", "?");
        error: incompatible types: Pair<String,String> cannot be converted to Pair<Integer,String>

        Pair<Double, String> test = new Pair<Integer, String >(15, "?");
        error: incompatible types: Pair<Integer,String> cannot be converted to Pair<Double,String>
        
        Lý do: Type safety (An toàn kiểu dữ liệu) của Java Generic
        */
    }
 }
