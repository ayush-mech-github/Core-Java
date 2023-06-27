interface BasicAnimal{
    void eat();
    void sleep();

}
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");

    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        
        System.out.println("eating...");
    }
    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        System.out.println("\n");
        
        //polymorphism
        Monkey m = new Human();
        m.bite();
        m.jump();

    }
}
