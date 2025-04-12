package principleOfOop.relationship;

public class Rom {
	String brand;
	int size;
	int readSpeed;
	int writeSpeed;
	
	public Rom() {
	}

	public Rom(String brand, int size, int readSpeed, int writeSpeed) {
		this.brand = brand;
		this.size = size;
		this.readSpeed = readSpeed;
		this.writeSpeed = writeSpeed;
		System.out.println("Rom loaded!");
	}	
	
	public void displayRom()
	{
		System.out.println("Rom Brand: "+brand);
		System.out.println("Rom Size: "+size);
		System.out.println("Rom readspeed: "+readSpeed);
		System.out.println("Rom writespeed: "+writeSpeed);
	}
}
