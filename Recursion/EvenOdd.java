import java.util.*;

public class EvenOdd{
	
	public int even(int range){
		if(range==0){
			System.out.println("0");
		}
		else{
			if(range%2==0){
				System.out.println("Even:"+" "+range);
			}
			even(range-1);
		}
		return 0;
	}
	
	public int odd(int range){
		if(range==0){
			System.out.println("0");
		}
		else{
			if(range%2==1){
				System.out.println("Odd"+" "+range);
			}
			odd(range-1);
		}
		return 0;
	}
	
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int range=scan.nextInt();
		EvenOdd e=new EvenOdd();
		e.odd(range);
		e.even(range);
		
	}
}