class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class linklist{
   public Node head;
    linklist(){
        head=null;
    }
    public void add(int data){
        Node t=new Node(data);
        t.next=head;
        head=t;
    }
    public void pop(){
        if(head==null)
            return;
      head=head.next;
    }
    public int peek(){
        if(head==null)
           return 0;
         return head.data;
    }
    public void print(){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
    private void print1(Node t){
        if(t==null)
           return;
        print1(t.next);
        System.out.println(t.data);
    }
    public void printInReverse(){
        print1(head);
    }
}
public class Main
{
     public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node nxt=head;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr.next;
            curr=nxt;
        }
        return prev;
    }
	public static void main(String[] args) {
		linklist st=new linklist();
		st.add(4);
		st.add(7);
		st.add(9);
		st.print();
		st.pop();
		System.out.println("after pop operation");
		st.print();
		//System.out.println(st.peek());
		System.out.println("reverse order print");
		st.printInReverse();
		Node t=reverse(head);
		int rem=0;
		while(t.next!=null){
		    t.data=(t.data+1+rem)%10;
		    rem=(t.data+1+rem)/10;
		    t=t.next;
		}
		if(rem>0){
		    Node k=Node(rem);
		    t.next=k;
		}
		Node h1=reverse(t);
		while(h1!=null){
		    SYstem.out.println(h1.data);
		   h1=h1.next;
		}
	}
}
