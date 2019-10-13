package by.epam.les10.main;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	    private double price;
	    private List<Flower> flowers = new ArrayList<Flower>();
	    private List<Packaging> packages = new ArrayList<Packaging>();
	    
	  
	    
	    public Bouquet addFlower(Flower flower) {
	        flowers.add(flower);
	        price += flower.getPrice();
	        return this;
	    }
	    
	    public void addPackaging(Craft cr) {
			packages.add(cr);
			this.price += price;
		}
	    
		public double getPrice() {
			// TODO Auto-generated method stub
			return price;
		}

		@Override
		public String toString() {
			return "Flower [flowers=" + flowers + "]\n";
		}		
		
	}

	

	

	

