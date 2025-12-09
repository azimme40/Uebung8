package h1;

public class Bruch {
	int zaehler; 
	int nenner; 
	
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler; 
		this.nenner= nenner; 
	}
	
	private int ggT (int x, int y)
	{
		x = Math.abs(x); 
		y = Math.abs(y); 
		int q = 1; 
		int r = x%y; 
		 if (x<y)
		 {
			 int tempx = x; 
			 x = y; 
			 y = tempx;  
		 }
		 
		 do {
			 r = x% y; 
			 x = y; 
			 y = r; 
			 
		 }
		 while (r>0);
		 

		return x; 
	} 
	
	public void shorten()
	{
		int tempzaehler= zaehler; 
		
	zaehler = zaehler/ ggT(zaehler, nenner); 
	nenner = nenner / ggT(tempzaehler, nenner); 
	
	 System.out.println(zaehler); 
	 System.out.println(nenner); 
	
	}
	public boolean hasSameValueAs (Bruch b)
	{
		b.shorten(); 
		
		if (b.zaehler == zaehler && b.nenner == nenner)
		{
			return true; 
		}
		return false; 
	}
}

