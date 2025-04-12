package principleOfOop.relationship;

public class Processor {
	String brand;
	int core;
	int thread;
	String series;
	
	private Processor() {
	}

	public Processor(String brand, int core, int thread, String series) {
		this.brand = brand;
		this.core = core;
		this.thread = thread;
		this.series = series;
		System.out.println("processor loaded!");
	}
	
	public void displayProcessor()
	{
		System.out.println("Processor Brand: "+brand);
		System.out.println("Processor Core: "+core);
		System.out.println("Processor Thread: "+thread);
		System.out.println("Processor Series: "+series);
	}
}
