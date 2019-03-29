public class SumDigits{

public int sum(int n){
	if(n!=0){
		return n%10+sum(n/10);
	}
	else{
		return 0;
	}
}
public static void main(String []args){
	SumDigits s=new SumDigits();
	System.out.println(s.sum(325));
	}
}