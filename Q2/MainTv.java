package assignment2;

public class MainTv {

	public static void main(String[] args) {
   TvRemote f=new SonyTv("Red");  
   TvRemote s=new BPLTv("Pink");
   TvRemote t=new PanasonicTv("Black"); 
   f.displayResolution();
s.displayResolution(); 
t.displayResolution();
f.tvSize();
s.tvSize(); 
 t.tvSize();
 //f.remoteColor("Green");
	}

}
