public class LargestElement{

int largest;
int random;
public int element(int array[], int length){
	
	if(length==0){
		return 0;	
	}
	
	else{
		if(array[length-1]>array[length]){
			largest=array[length-1];
			array[length-1]=array[length];
			array[length]=largest;
		}
		element(array,length-1);
	}
	return array[length];
}


public static void main(String []args){
LargestElement l=new LargestElement();
int array[]={7,5,1,10,8};
System.out.println(l.element(array,array.length-1));
	
	}
}