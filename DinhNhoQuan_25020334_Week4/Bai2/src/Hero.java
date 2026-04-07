public class Hero extends ActionCharacter implements CanFly, CanSwim {
    public void swim(){ 
        System.out.println("Hero is swimming");
    }
    public void fly() {
        System.out.println("Hero is flying");
    }
}
