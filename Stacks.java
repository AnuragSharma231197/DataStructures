import java.util.*;

public class Stacks{

static int array[];
static int top;
static int capacity;
public Stacks(int size){
this.array=new int[size];
	this.capacity=size;
	top=-1;
}


public static void push(int add){
	if(top!=capacity-1){
		System.out.println("Stack is not full");
		array[top+1]=add;
	}
	else{
	System.out.println("Stack is full");
	System.exit(0);
	}
}

public static void pop(){
	if(top!=-1){
		System.out.println("Stack is not empty");
		array[top]=0;
		top--;
	}
}

public static void main(String []args){
	System.out.println("Enter what you want to do?");
	System.out.println("1.Push 2. Pop");
	
	Scanner scan=new Scanner(System.in);
	int response=scan.nextInt();
	
	System.out.println("Enter the size of stack");
	int size=scan.nextInt();
	
	Stacks stack=new Stacks(size);
	
	if(response==1)
	{
		System.out.println("Enter the element to add");
		int add=scan.nextInt();
		Stacks.push(add);
	}
	else if(response==2)
	{
		Stacks.pop();
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
