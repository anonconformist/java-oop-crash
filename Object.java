class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void print(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){  //parameterised constructor
        System.out.println("constructor called");
        this.name = name;
        this.age  = age;
    }

    Student(Student s){  //copy constructor
        this.name = s.name;
        this.age = s.age;
    }
}
class Object{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ball";

        p1.print();
        p2.print();

        Student s1 = new Student("tahir",23);
        // s1.name = "tahir";
        // s1.age = 23;
        s1.info();

        Student s2 = new Student(s1);
        s2.info();

    }
}