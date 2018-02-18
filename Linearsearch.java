import java.util.*;
public class Linearsearch{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int count=0;
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the element");
		int elements=scan.nextInt();
		for(int i=0;i<size;i++){
			if(array[i]==elements){
				System.out.println("Positions of element:"+i);
			}
		}
		
	}
}