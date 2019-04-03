import java.util.*;

public class Palindrome{
int i;
String newString="";
char ch[];
public String reverse(String str){
	ch=str.toCharArray();
	i=ch.length-1;
	StringBuilder builder=new StringBuilder(str);
	if(str.length()==0){
		return "None";
	}
	else{
		newString=newString+ch[i];
		builder.deleteCharAt(str.length()-1);
		reverse(builder.toString());
		return newString;
	}
		
}
	
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		Palindrome p=new Palindrome();
		
		if(str.equals(p.reverse(str))){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}