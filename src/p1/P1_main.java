package p1;

public class P1_main {
	
	public static void main(String[] args) {
		int a=34; 
		System.out.println(getNumber(a));
	}
	
	public static int getNumber (int a)
	{
		
		
		int l =( a >42) ?  42:  0; 
		
		return l; 
	}
	

}
