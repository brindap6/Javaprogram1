package Fruitsname;

public class MainFruits {
	
    public static void main(String[] args) {
    	
    	Apple Z = new Apple();
    	Z.setfruitsname("Apple");
    	System.out.println("name is : "+Z.getfruitsname());
    	
    	Z.setcolour("red");
    	System.out.println("colour is : "+Z.getcolour());
    	
    	Z.setprice(5);
    	System.out.println("price is : "+Z.getprice());
    	
    	
    	Z.bestfruits();
    	Z.bestfruits("eat");
    	
    	
    	kivi K1 = new kivi();
    	K1.vitamins();
    	
 }
}
