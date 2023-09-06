


// Interfaces can have default methods, so that we can implement them only when need.
interface Bicycle{
    static int n = 45;
    void speed(int increment);
    void brake(int decrement);
}

class scooty implements Bicycle{

    void own(){
        System.out.println("My own method");
    }

    public void speed(int increment){
        System.out.println(++increment);
    } 

    public void brake(int decrement){
        System.out.println(--decrement);
    } 
}

// You can even create one more interface and scooty can implement that also at same time
// Example interface horn
// class scooty implements Bicycle, horn{}
// Now scooty can use all methods in both intrfaces


// A class can inherit only one class , but can implement many interfaces


public class interfaces {
    public static void main(String[] args) {
        scooty s = new scooty();
        s.speed(7);
        s.brake(5);
        // You can create properties in interface
       // System.out.println(s.n);
        // You cannot change the values as they are final
        // To check uncomment the below line
        // s.n = 3;
    }
}
