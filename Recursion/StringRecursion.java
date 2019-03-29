import java.util.*;

public class StringRecursion{
	
	public static void reverse1(int []array, int length){
		if(length!=-1){
		reverse1(array,length-1); 
		System.out.println(array[length]);
		}
	}
	public static void main(String []args){
		int array[]=new int[]{1,2,3,4,5};
		StringRecursion.reverse1(array,array.length-1);
			
			
	}	
}