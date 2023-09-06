import java.util.Scanner;

public class infixtopostfix {

    static int precedence(char op){
        // To get the precendence
        if(op == '^'){
            return 3;
        }
        else if(op == '*' || op == '/'){
            return 2;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char stack[] = new char[input.length()];
        int top = -1;

        for(int i=0;i<input.length();i++){
            
            if(input.charAt(i) == '('){
                top++;
                stack[top] = input.charAt(i);
            }


            // for operators
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i)=='^'){
                // if stack empty push the operator
                if(top == -1){
                    top++;
                    stack[top] = input.charAt(i);
                }
                // Check the precendence
                else{
                    int pre = precedence(stack[top]);
                    int curr = precedence(input.charAt(i));

                    // if pred of top of stack < coming oper than push
                    if(curr > pre ){
                        top++;
                        stack[top] = input.charAt(i);
                    }

                    // if pred of top > coming oper then print,pop top of stack
                    // again check with new top
                    else if(pre > curr){
                        // remaining...
                        while(top != 0 && pre >= curr)
                        {
                            System.out.print(stack[top] + " ");
                            top--;
                            pre = stack[top]; 
                        }

                        top++;
                        stack[top] = input.charAt(i);
                    }
                    else{
                        if(input.charAt(i) != '^' ){
                            System.out.print(stack[top]+" ");
                            stack[top] = input.charAt(i);
                        }
                        else{
                            top++;
                            stack[top] = input.charAt(i);
                       }
                    }


                }
            

            }
            else if(input.charAt(i) == ')'){
                while(stack[top] != '(' && top>=0){
                    System.out.println(stack[top]+ " ");
                    top--;
                }
            }
           
            else{
                System.out.print(input.charAt(i)+" ");
            }

        //    for(int j=0;j<=top;j++){
        //         System.out.println(stack[j]);
        //    }
        //    System.out.println("\n");
            

            
        }

        while(top != -1){
            System.out.print(stack[top]+ " ");
            top--;
        }

        sc.close();
    }
}


//a-b/c*d+e
// output --> abc/d*-e+
