public class Main {
	public static void main(String[] args) {
        UIFactory factory;

        String os = "win";
        if(os.equals("win")) factory = new WindowsFactory();
        else if(os.equals("mac")) factory = new MacFactory();
        else  {
            System.out.println("Wrong OS.");
	        return ;
        }
        Button btn = factory.createButton();
        Checkbox cb = factory.createCheckbox();

        btn.render();
        cb.render();
    }
 }
