public class overloading {

    // methods with same name, but different types of parameters
    // method overloading cannot be done by changing the return the return type of the method

    static void message(){
        System.out.println("Good afternoon");
    }

    static void message(String n){
        System.out.println("Good afternoon " + n);
    }
    public static void main(String[] args) {
        message();
        message("Nishita");
        // Arguments are actual
    }
}
