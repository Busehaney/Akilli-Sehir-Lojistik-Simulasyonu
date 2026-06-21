package nypproje;

public class Konum {
	
	private double x;
	private double y;
	
	public void setX(double x) {
		this.x=x;
	}
	public double getX() {
		return x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double getY() {
		return y;
	}
	
	public Konum(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double mesafeHesapla() { //Mesafe hesaplayan metot
		double mesafe= Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
		return mesafe;
	}
	
	

}
