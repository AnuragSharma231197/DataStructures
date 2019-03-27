import java.util.*;

public class LinkedListMiddle{

NodeMiddle head;	
static Scanner scan;
	
	public LinkedListMiddle(NodeMiddle headNode){
		this.head=headNode;
	}
	
	
	public void insertBegin(int data){
		NodeMiddle new_node=new NodeMiddle();
		new_node.data=data;
		
		if(head!=null){
			NodeMiddle secondAddress=head.next;
			head.next=new_node;
			new_node.next=secondAddress;
		}
		System.out.println("Showing data");
		show();
	}
	
	public void insertAt(int data, int index){
		NodeMiddle new_node=new NodeMiddle();
		new_node.data=data;
		NodeMiddle last=head;
		if(head!=null){
			for(int i=0;i<index-1;i++){
				last=last.next;
			}
			
			NodeMiddle indexNode=last.next;
			last.next=new_node;
			new_node.next=indexNode;
		}
	}
	
	public void insertLast(int data){
		NodeMiddle new_node=new NodeMiddle();
		new_node.data=data;
		
		NodeMiddle lastNode=head;
		
		while(lastNode.next!=null){
			lastNode=lastNode.next;
		}
		lastNode.next=new_node;
	}
	public void show(){
		NodeMiddle last=head;
		while(last.next!=null){
			System.out.println(last.data);
			last=last.next;
		}
		
		System.out.println(last.data);
		
	}
	
public static void main(String []args){
	scan= new Scanner(System.in);
	System.out.println("Enter the response you want to enter: 1.Insert at Begin 2.Insert at Mid 3.Insert at Last");
	//int response=scan.nextInt();
	NodeMiddle headNode=new NodeMiddle();
	LinkedListMiddle list=new LinkedListMiddle(headNode);
	
		list.insertBegin(1996);
		System.out.println("New Data1");
		list.insertBegin(1997);
		System.out.println("New Data2");
		list.insertBegin(1998);
		System.out.println("New Data3");
		list.insertBegin(1999);
		System.out.println("Insert Element at specific position");
		list.insertAt(10,3);
		System.out.println("Inserting Element");
		list.insertLast(5000);
		System.out.println(" ");
		System.out.println("Showing new Data");
		list.show();
	}
	
}