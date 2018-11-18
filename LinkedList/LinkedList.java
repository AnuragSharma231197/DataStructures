public class LinkedList{
public Node head;
public void insert(int item){
	Node node=new Node();
	node.data=item;
	node.address=null;
	
	if(head==null){
		head=node;
		}
		else{
			Node n=head;
			while(n.address!=null){
				n=n.address;
			}
			if(n.address==null){
				n.address=node;
			}
		}
	}
	public void insert1(int index, int item){
		Node node=new Node();
		node.data=item;
		node.address=null;
		
		Node n=head;
		Node prev=null;
		int count=0;
		while(n.address!=null && count<index){
			prev=n;
			n=n.address;
			count=count+1;
		}
		node.address=prev.address;
		prev.address=node;
	}
	public void show(){
		Node temp=head;
		while(temp.address!=null){
			System.out.println(temp.data);
			temp=temp.address;
		}
		System.out.println(temp.data);
	}
}