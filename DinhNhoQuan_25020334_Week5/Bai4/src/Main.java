public class Main {
	public static void main(String[] args) {

        String content = "Hello world. This is a java program. Hello java, hello world.";
        
        WordCounter counter = new WordCounter();

        counter.analyze(content);
	    counter.displayResult();
    }
 }
