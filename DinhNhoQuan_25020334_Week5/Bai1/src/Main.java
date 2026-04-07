public class Main {
	public static void main(String[] args){

        long start = System.currentTimeMillis();
        // run useString()
        long Time1 = Function.useString();
        System.out.println(Time1 - start);
        
        //run useStringBuffer()
        long Time2 = Function.useStringBuffer();
        System.out.println(Time2 - Time1);
        
        String text = "Java - ngon ngu ki quac. Kho hieu";
        Function.contentAnalysis(text);    
    }
 }
