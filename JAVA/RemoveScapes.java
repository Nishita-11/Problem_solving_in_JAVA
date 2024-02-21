
import java.util.Scanner;

public class RemoveSpace
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		char[] input = str.toCharArray();
		StringBuffer output = new StringBuffer();
		
		for(char c : input){
		    if(!Character.isWhitespace(c)){
		        output.append(c);
		    }
		}
		
		System.out.print(output);
	}
}
