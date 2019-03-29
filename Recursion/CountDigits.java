public class CountDigits{
static int count=0;
public int digits(int n){
	if(n!=0){
		digits(n/10);
		count=count+1;
		return 0;
	}
	else{
		return 0;
	}	
}
public static void main(String []args){
	CountDigits c=new CountDigits();
	c.digits(123456);
	System.out.println(count);
	
	}
}