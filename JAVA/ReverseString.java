import java.util.Scanner;


public class ReverseString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		
		if(str == null){
		    throw new IllegalArgumentException("Null is not valid string");
		}
		else{
		    StringBuilder rev = new StringBuilder();
		    char[] s = str.toCharArray();
		    
		    for(int i=s.length-1;i>=0;i-- ){
		        rev.append(s[i]); 
		    }
		    
		    System.out.println(rev);
		}
		
	}
}
