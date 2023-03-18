package Week3.Interface;
import Week3.Interface.Phone.Camera;
import Week3.Interface.Phone.MusicPlayer;



class SmartPhones extends Phone implements MusicPlayer,Camera{
	 public void click() {
		 System.out.println("Click method of camera interface");
	 }
	 public void record() {
		 System.out.println("Record method of camera interface");
	 }
	 
	 public void play() {
		 System.out.println("Play method of MusicPlayer interface");
	 }
	 public void stop() {
		 System.out.println("Stop method of MusicPlayer interface");
	 }
	 
}


