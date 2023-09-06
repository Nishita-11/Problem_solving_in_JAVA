import java.util.Scanner;
import java.util.Stack;

public class balancedparenthesis {


    static void result(String str){

        Stack<Character> stack = new Stack<>();

        int f = 0;

        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.empty()){
                    System.out.println("false");
                    f=1;
                    break;
                }
                else{
                    if(str.charAt(i) == '}' && stack.peek()=='{'){
                        stack.pop();
                    }
                    if(str.charAt(i) == ']' && stack.peek()=='['){
                        stack.pop();
                    }
                    if(str.charAt(i) == ')' && stack.peek()=='('){
                        stack.pop();
                    }
                }
                
            }   
        }

        if(f == 0){
            if(!stack.empty()){
            System.out.println("Not Balanced!");
            }
            else System.out.println("Balanced!!");
        }
        
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        result(str);
        

        sc.close();


    }
}
