import java.util.*;

public class Fibonaci{
int a=0;
int b=1;
public int fibonaci(int n){
	int c;
	if(n!=0){
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		return fibonaci(n-1);
	}
		else{
			return 0;
		}
	}
	
	public static void main(String []args){
		
		Fibonaci f=new Fibonaci();
		f.fibonaci(6);
	}
}