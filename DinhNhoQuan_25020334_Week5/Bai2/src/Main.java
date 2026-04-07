public class Main {
    public static void main(String[] args) {
        SupportSystem shopeeSupport = new SupportSystem();

        shopeeSupport.addCustomer(new Customer("c1", "Khach A"));
        shopeeSupport.addCustomer(new Customer("c2", "Khach B"));

        Customer current = shopeeSupport.serveNext();
        if (current != null) {
            shopeeSupport.typeMessage("Chao ban, minh la nhan vien shopee.");
            shopeeSupport.typeMessage("Ban can ho tro ve don hang nao?");
            shopeeSupport.typeMessage("Oop, minh go nham.");
            
            shopeeSupport.viewLast();
            shopeeSupport.undoMessage();         
        }

        shopeeSupport.serveNext();
        shopeeSupport.typeMessage("Chao ban B, minh co the giup gi?");

        shopeeSupport.serveNext();
    }
}
