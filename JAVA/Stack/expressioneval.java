import java.util.Scanner;
import java.util.Stack;

public class expressioneval {

    static Stack<Integer> valuestack = new Stack<>();
    static Stack<Character> operatorstack = new Stack<>();



    // Character.getNumericValue(c);  
    // Integer.parseInt(String.valueOf(c));  

    static int gettwoele(char c){
        int n1 = Integer.valueOf(valuestack.peek()); 
        valuestack.pop();
        int n2 = Integer.valueOf(valuestack.peek());
        valuestack.pop();

        switch(c){
            case '+':
                return n1 + n2;
               
            case '-':
                return n2 - n1;
               
            case '*':
                return n1 * n2;
              
            case '/':
                return n2 / n1;
                
        }
        return 0;
    }

    static int precedence(char string){
        if(string == '*' || string=='/'){
            return 2;
        }
        else if(string == '+' || string=='-'){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] input = str.toCharArray();
        
        String s = "" ;
       
        for(int i=0;i<input.length;i++){

            if(input[i] == ' '){
                continue;
            }
            if(input[i] != '+' ||  input[i] != '-' || input[i] != '*' || input[i] != '/' || input[i] != '(' || input[i] != ')'){
                s=s+input[i];
                
            }

            if(input[i] == '+' || input[i] == '-' || input[i] == '*' || input[i] == '/'){
                while(!operatorstack.isEmpty() && precedence(operatorstack.peek()) >= precedence(input[i])){
                    int value = gettwoele(operatorstack.peek());
                    valuestack.push(value);
                    

                }

                operatorstack.push(input[i]);
            } 
            else if(input[i] == '('){
                operatorstack.push(input[i]);
            }
            else if(input[i] == ')'){
                while(operatorstack.peek() != '('){
                   
                    int value = gettwoele(operatorstack.peek());
                    valuestack.push(value);
                    operatorstack.pop();
                    
                }
                operatorstack.pop();
            }
            else{
                valuestack.push(Character.getNumericValue(input[i]));
            }
            
        }

        while(!operatorstack.isEmpty()){
            
            int value = gettwoele(operatorstack.peek());
            valuestack.push(value);
             operatorstack.pop();
             
        }

        System.out.println(valuestack.peek());

        sc.close();

    }
}
