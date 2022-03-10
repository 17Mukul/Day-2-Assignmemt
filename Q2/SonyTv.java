package assignment2;

public class SonyTv implements TvRemote {  
	String color;
	public SonyTv(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("5k Ultra HD");
 } 
 public void tvSize() {
	 System.out.println("54 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }
}
