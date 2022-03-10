package assignment2;

public class PanasonicTv implements TvRemote {
	String color;
	public PanasonicTv(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("2k Ultra HD");
 } 
 public void tvSize() {
	 System.out.println("32 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }

}
