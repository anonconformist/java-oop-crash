abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new animal");
    }

    public void eat(){
        System.out.println("iam eating");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("you are creating a new horse");
    }
    
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

      //  Animal a  = new Animal();  // abstract class annot be initaited

    }
}