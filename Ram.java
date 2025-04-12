package principleOfOop.relationship;

public class Ram {
	String brand;
	String series;
	int size;
	
	public Ram() {
	}

	public Ram(String brand, String series, int size) {
		this.brand = brand;
		this.series = series;
		this.size = size;
		System.out.println("Ram loaded!");
	}
	
	public void displayRam()
	{
		System.out.println("Ram Brand: "+brand);
		System.out.println("Ram Series: "+series);
		System.out.println("Ram size: "+size);
	}
}
