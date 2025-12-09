package h2;

public class H2_main {
	public static void main(String[] args)
	{
		SimpleList myList = new SimpleList();
        
       
        myList.append(3);
        myList.append(5);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);
        
        
        System.out.println("Nach appends: " + getListAsString(myList));
      
        
       
        boolean inserted = myList.insertAfter(45, 4);
        System.out.println("insertAfter(45, 4) erfolgreich: " + inserted);
        System.out.println("Nach insertAfter: " + getListAsString(myList));
		
        Node found = myList.findFirst(45);
        if (found != null) {
            System.out.println("findFirst(45) gefunden: Wert = " + found.value);
            
        } else {
            System.out.println("findFirst(45) nicht gefunden");
	}
        boolean deleted = myList.delete(45);
        System.out.println("delete(45) erfolgreich: " + deleted);
        System.out.println("Nach delete: " + getListAsString(myList));
	}
        
        private static String getListAsString(SimpleList list) {
            StringBuilder sb = new StringBuilder();
            Node current = list.getFirst();
            while (current != null) {
                sb.append(current.value);
                if (current.next != null) {
                    sb.append(",");
                }
                    current = current.next;
                }
                return sb.toString();
        }
}
