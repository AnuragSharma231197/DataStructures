public class GCD{
int next;
public int gcdMethod(int dividend, int divisor){
	
	if(divisor!=0){
		return gcdMethod(divisor,dividend%divisor );
	}
	else{
		return dividend;
	}
}
public static void main(String []args){
	GCD gcd=new GCD();
	
	System.out.println(gcd.gcdMethod(48,18));
	
	}
}