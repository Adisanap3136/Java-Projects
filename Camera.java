package principleOfOop.relationship;

public class Camera {
	String brand;
	String quality;
	
	public Camera() {
	}

	public Camera(String brand, String quality) {
		this.brand = brand;
		this.quality = quality;
	}
	
	public void displayCamera()
	{
		System.out.println("camera brand: "+brand);
		System.out.println("camera quality: "+quality);
	}
}
