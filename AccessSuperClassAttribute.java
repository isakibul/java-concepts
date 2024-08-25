class Animal{
    protected String type = "animal";
}

class Dog extends Animal{
    public String type = "mammal";

    public void printType(){
        System.out.println("I am a " + type);
        System.out.println("I am a " + super.type);
    }
}

public class AccessSuperClassAttribute {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.printType();
    }
}
