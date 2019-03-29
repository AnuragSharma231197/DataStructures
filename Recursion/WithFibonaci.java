import java.util.*;
public class WithFibonaci{
public static void main(String []args){
Scanner scan=new Scanner(System.in);

int a=0;
int b=1;
int c=0;
int num=scan.nextInt();
for(int i=0;i<num;i++){
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
}


	}
}