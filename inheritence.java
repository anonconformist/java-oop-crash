class Shape{
    // String color;
    public void area(){
        System.out.println("display area");
    }

}

class Triangle extends Shape {
    public void area(int l , int h){
        System.out.println("area of Triangle: "+ (0.5*l*h));
    }
}

class EquilateralTriangle extends Triangle{ //multiple inheritence
    public void area(int l,int h){
        System.out.println("area of EquilateralTriangle: "+ (0.5*l*h));
    }
}

class Cirle extends Shape{  //hierarchial inheritence
    public void area(int r){
        System.out.println("area of Circle :"+ (3.14*r*r));
    }
}
public class inheritence {
    public static void main(String args[]){
        // Triangle t1  = new Triangle();
        // t1.color  = "red";
    }
}
