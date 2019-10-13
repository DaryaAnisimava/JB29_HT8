package by.epam.les10.main;

public class Craft extends Packaging {
	    private String name;

	    public Craft(double price, String name, String color) {
			super(price, name, color);
			this.setName(name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		}
}



