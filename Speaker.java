package principleOfOop.relationship;

public class Speaker {
	String brand;
	int noOfSpeaker;
	
	public Speaker() {
	}

	public Speaker(String brand, int noOfSpeaker) {
		this.brand = brand;
		this.noOfSpeaker = noOfSpeaker;
	}
	
	public void displaySpeaker()
	{
		System.out.println("Speaker brand: "+brand);
		System.out.println("Speaker no of speaker: "+noOfSpeaker);
	}
}
