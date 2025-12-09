package h2;

public class SimpleList {
	Node head = new Node (0);
	//Attribute
	
	public SimpleList() //Constructor
	{
		this.head = new Node(0); 
		
	}
	
	public Node getFirst() //
	{
		if ( head.next == null)
		{
			return null; 
		}
		else {
			return head.next;
		}
		
	}
	public Node getLast() // FINDET DEN LETZTEN KNOTEN 
	{
		if ( head.next == null)
		{
			return null; 
		}
		
		else {
			Node TempList = head.next; 
			
			while (TempList.next != null)
			{
				TempList = TempList.next;
			}
			return TempList; 
		}
	}
	public void append( int newValue)
	{
		 Node Ende = new Node(newValue);
		 
		 
		 if (head.next == null) {
	            head.next = Ende;
	        } else {
	            Node last = getLast();
	            last.next = Ende;
	        }
		
		 
			  
	}
	
	 public Node findFirst (int value)
	 {
		  
		 Node Vergleich = head.next;
		 
		 
		 while (Vergleich != null)
			 {
			 
			 
			 if (Vergleich.value == value)
			 {
				 return Vergleich; 
			 }
			 Vergleich = Vergleich.next; 
			
		 }
		 return null;
	 }
	 
	public boolean insertAfter(int preValue, int newValue) //
	{
		Node finden= findFirst(preValue); 
		
		
		if (finden == null)
		{
			return false; 
		}
		else {
			 Node neu = new Node (newValue); 
			 neu.next=finden.next; 
			 finden.next= neu; 
			 return true; 
			
		}
	}
	
	public boolean delete (int value)
	{
		Node start= head; 
		Node current = head.next; 
		
		while (current!= null)
		{
		if (current.value== value)
		{
			start.next = current.next; 
			return true; 
		}
		start = current; 
		current = current.next; 
		}
		return false; 
	}
	
	
		
	
	

}
