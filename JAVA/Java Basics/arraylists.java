import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylists {
    public static void main(String[] args) {
        
        // ArrayList<Integer> l1 = new ArrayList<>();

        // l1.add(4);
        // l1.add(6);
        // l1.add(0,5);

        // for(int i=0;i<l1.size();i++){
        //     String l = 'l'+ Integer.toString(i);
        //     System.out.println(l1.get(i));
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        String operation;

        for(int i=0;i<q;i++){
            operation = sc.nextLine();
            if(operation.equals("Insert")){
                int index = sc.nextInt();
                int num = sc.nextInt();

                list.add(index, num);
            }
            else{
                int index = sc.nextInt();

                list.remove(index);
            }
        }

        //Iterator < Integer > Iterator = list.iterator();
        // boolean flag = false;
        // while (Iterator.hasNext()) {
        // if (flag) System.out.print(" ");
        // flag = true;
        // System.out.print(Iterator.next());
        // }
        // System.out.print("\n");

        sc.close();
    }

   
}
