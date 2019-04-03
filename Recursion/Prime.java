import java.util.*;
public class Prime{
	int count=0;
	public int prime(int number){
		int i=1;
	if(number==0){
		return 0;
	}
	else if(number%i==0){
		count=count+1;
		i=i+1;
	}
	prime(number-1);
	return count;
	}
	
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		Prime p=new Prime();
		System.out.println("Enter the number");
		int number=scan.nextInt();
		if(p.prime(number)<=2){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
	}
	
}