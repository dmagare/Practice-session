package Package1;

public class Dog extends Animal {
    public Dog(){
        super();
    }
    public Dog(String name, int age){
        super(name,age);
    }
    @Override
    public void noise(){
        System.out.println("barking now");
    }
    public static void main(String[] args){

        Dog myDog= new Dog();
        myDog.noise();
        System.out.println(animalCounter);
        Dog yourDog = new Dog("Cogy",1);
        yourDog.noise();
        System.out.println(animalCounter);
    }

}
