public class ArrayElements{

public int array1(int array[],int length){
	int i=0;
	
	if(length!=-1){
	System.out.println(array[length]);
	array1(array,length-1);
	return 0;
	}
	else{
		return 0;
		
	}
	
} 


public static void main(String []args){
	ArrayElements a=new ArrayElements();
	int array[]={1,2,3,4,5};
	
	a.array1(array, array.length-1);
	
	}
}