import java.util.*;

public class NaturalNumbers{
	
	public int number(int n){
		
		if(n==0){
		return 0;
		}
		else{
			if(n>0){
				System.out.println(n);
				return number(n-1);
			}
		}
		return 0;
	}
	
	public static void main(String []args){
		NaturalNumbers nn=new NaturalNumbers();
		nn.number(5);
	}
}