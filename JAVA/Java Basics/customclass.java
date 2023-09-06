

// only 1 public class can be present in the file

class Student{
    int roll;
    String name;

    public void print(){
        System.out.println("Roll No : "+roll);
        System.out.println("Name : "+name);
    }
}



public class customclass {
    public static void main(String[] args) {
        Student nish = new Student();
        nish.roll = 184;
        nish.name = "Uppala Nishita";

        nish.print();

    }
}
