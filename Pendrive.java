package principleOfOop.relationship;

public class Pendrive {
	String brand;
	int size;
	int speed;
	
	public Pendrive() {
	}

	public Pendrive(String brand, int size, int speed) {
		this.brand = brand;
		this.size = size;
		this.speed = speed;
	}
	
	public void display()
	{
		System.out.println("pendrive brand: "+brand);
		System.out.println("pendrive size: "+size);
		System.out.println("pendrive speed: "+speed);
	}
}
