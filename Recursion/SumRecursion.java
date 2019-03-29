import java.util.*;

public class SumRecursion{

public int sum(int n){
	
	if(n==0){
		return 0;
	}
	else{
		return n+sum(n-1);
	}
}


public static void main(String []args){
	
	SumRecursion s=new SumRecursion();
	System.out.println("Sum is:"+s.sum(10));
	}

}