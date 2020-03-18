package entities;

public class retangulo {
	

		
		public double width;
		public double height;
		
		public double area () {
			return width * height;
		}
		
		public double perimeter() {
			return this.width * 2 + this.height * 2;
		}
		
		public double diagonal() {
			return Math.sqrt((this.height * this.height) + (this.width * this.width));
		}
		
		public String toString() {
			return this.area() + "," + this.perimeter() + "," + this.diagonal();
					
		}
		
	}


