// function overloading --> compile time
class StudentClass {
    String name;
    int age;

    public void info(String name) {
        System.out.println(name);
    }

    public void info(int age) {
        System.out.println(age);
    }

    public void info(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class polymorphism {
    public static void main(String args[]) {
        StudentClass s1 = new StudentClass();
        s1.name = "tahir";
        s1.age = 23;

        s1.info(s1.age);
    }
}
