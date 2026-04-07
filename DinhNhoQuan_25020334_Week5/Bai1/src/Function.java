public class Function {
    public static long useString() {
        String str = "";
        for(int i = 0; i < 100000; i++) {
            str += "Hello";
        }
        return System.currentTimeMillis();
    }

    public static long useStringBuffer(){ 
        StringBuffer strb = new StringBuffer("");
        for(int i = 0; i < 100000; i++) {
            strb.append("Hello");
        }
        return System.currentTimeMillis();
    }

    public static void contentAnalysis(String text) {
        String[] sentences = text.split("[\\.?!]");
        System.out.println("So luong cau:" + sentences.length);
        
        String updateText = text.replace("Java", "Python");
        System.out.println("Van ban sau khi thay the: " + updateText);
    }
}
