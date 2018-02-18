import java.util.*;
public class BinarySearch{
	public static int binary(int arr[],int low,int high,int num){
		int mid=low+(high-low)/2;
		if(arr[mid]==num){
			return mid;
		}
		if(arr[mid]>num){
			return binary(arr,low,mid-1,num);
		}
		else{
			return binary(arr,mid+1,high,num);
		}
	}
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		int high=arr.length-1;
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Sorting the array");
		Arrays.sort(arr);
		System.out.println("Enter the number you want to find?");
		int num=scan.nextInt();
		BinarySearch b=new BinarySearch();
		int result=b.binary(arr,0,high,num);
		System.out.println("Result:"+result);
		
	}
}