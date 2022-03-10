package assignment2;

public class BPLTv implements TvRemote {
	String color;
	public BPLTv(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("6k Ultra HD");
 } 
 public void tvSize() {
	 System.out.println("60 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }
}
