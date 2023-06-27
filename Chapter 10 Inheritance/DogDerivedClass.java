class Animal{
    public void AnimalMethod(){
        System.out.println("this is animal class");
    }
}
class Dog extends Animal{
    public void DogMethod(){
            System.out.println("this is Dog class derived from animal class");
    }
}

public class DogDerivedClass{
    public static void main(String[] args){
    Animal a = new Animal();
    Dog b = new Dog();
    a.AnimalMethod();
    b.DogMethod();
    b.AnimalMethod();
    }
}