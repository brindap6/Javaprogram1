package Fruitsname;

public class fruits {
	
	private String fruitsname;
	private String colour;
	private int price;
	
	public fruits() {
		
	}

	public fruits(String fruitsname, String colour, int price ) {
		super();
		this.fruitsname = fruitsname;
		this.colour = colour;
		this.price = price;
	}
	
	public String getfruitsname() {
	 return fruitsname;
	}
	 
	 public void setfruitsname(String fruitsname) {
		 this.fruitsname = fruitsname;
	 }	
	 
	 public String getcolour() {
		 return colour;
	 }
	 
	 public void setcolour(String colour) {
		 this.colour = colour;
	 }
	 
	 public int getprice() {
		 return price;
	 }
	 
     public void setprice(int price) {
    	 this.price = price;
     }
     public void eat() {
    	 System.out.println("ear eat..");
     }
     
		 
		 
	 
	 
	 
	}

