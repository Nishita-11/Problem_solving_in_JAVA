import java.util.Scanner;;

public class literals{
    public static void main(String[] args) {
        int age = 22;
        char ch = 'N';
        // float f1 = 5.6f;
        System.out.println(age);
        System.out.println(ch);

        Scanner sc = new Scanner(System.in);
        //sc.next() till white spaces
        //Full line
        String name = sc.nextLine();
        System.out.println(name);

        sc.close();

    }
} 