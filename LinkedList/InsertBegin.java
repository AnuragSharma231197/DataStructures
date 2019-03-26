import java.util.*;
public class InsertBegin{

Node1 head;

public InsertBegin(Node1 headNode){
	this.head=headNode;
}

public void beginAdd(int data)
{
	Node1 new_node=new Node1();
	new_node.data=data;
	
	if(head!=null){
		Node1 second=head.next;
		head.next=new_node;
		new_node.next=second;
	}
	
	show();
}

public void show(){
	Node1 n=head;
	
	while(n.next!=null){
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data);
}


public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("What do you want to do? 1. Insert");
	int response=scan.nextInt();
	Node1 headNode=new Node1();
	InsertBegin i=new InsertBegin(headNode);
	if(response==1){
		System.out.println("Insert element:");
		int data=scan.nextInt();
		i.beginAdd(data);
		System.out.println("Inserting new Element");
		i.beginAdd(25);
		}
	}
}