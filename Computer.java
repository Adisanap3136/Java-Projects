package principleOfOop.relationship;

public class Computer {
	String Brand;
	double price;
	String series;
	Processor p1;
	Ram ra1;
	Rom ro1;
	Speaker sp1;
	Camera c1;
	Pendrive pd1;
	
	public Computer() {
	}

	public Computer(String brand, double price, String series,String proBrand,int core,int thread,String proSeries,String ramBrand,String ramSeries,int ramSize,String raomBrand, int romSize, int romReadSpeed, int romWriteSpeed) {
		p1 = new Processor(proBrand, core, thread, proSeries);       //early binding
		ra1 = new Ram(ramBrand, ramSeries, ramSize);				//early binding
		ro1 = new Rom(raomBrand, romSize, romReadSpeed, romWriteSpeed);			//early binding
		Brand = brand;
		this.price = price;
		this.series = series;
	}
	
	public void displayComputer()
	{
		System.out.println("Computer Brand: "+Brand);
		System.out.println("Computer price: "+price);
		System.out.println("Computer series: "+series);
	}
	
	//helper method for camera  (loose coupling)
	public void addCamera(String brand , String quality)
	{
		c1 = new Camera(brand, quality);
		System.out.println("Camera Added!");		
	}
	
	//helper method for pendrive  (loose coupling)
	public void addPendrive(String brand,int size,int speed)
	{
		pd1 = new Pendrive(brand, size, speed);
		System.out.println("Pendrive added!");
	}
	
	//helper method for speaker (loose coupling)
	public void addSpeaker(String brand,int noOfSpeaker)
	{
		sp1 = new Speaker(brand, noOfSpeaker);
		System.out.println("Speaker added!");
	}
}