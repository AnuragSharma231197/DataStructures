import java.util.*;

public class Power{
int powerNum=1;
public int power(int base, int power1){
	if(power1==0 || base==0){
		return 0;
	}
	else{
		powerNum=powerNum*base;
		power(base,power1-1);
		return powerNum;
	}
}

public static void main(String []args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the base value");
	int base=scan.nextInt();
	System.out.println("Enter the power value");
	int power=scan.nextInt();
	
	Power p=new Power();
	System.out.println("Power is:"+" "+p.power(base,power));
	
	}

}