package by.epam.les10.main;

public class Packaging {
		private double price;
		private String name;
		private String color;
		

		public Packaging(double price,String name, String color) {
			this.price = price;
			this.name = name;
			this.color = color;
		}


		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

	

		public String getColor() {
			return color;
		}

		

}

