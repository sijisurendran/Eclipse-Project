package Interface;
interface Smartvremote
{
	public void bluetooth();
	public void voiceassistant();
	public void selectbutton();
	public void volumebutton();
	
}
interface Tvremote extends Smartvremote
{
	public void volumeup();
	public void voulumedown();
	public void channelup();
	public void channeldown();
}
class Smarttv implements Smartvremote
{

	@Override
	public void bluetooth() {
		System.out.println("Bluetooth");
		
	}

	@Override
	public void voiceassistant() {
		System.out.println("Voice assistant details");
		
	}

	@Override
	public void selectbutton() {
		System.out.println("Select botton details");
	}

	@Override
	public void volumebutton() {
		System.out.println("Volume button details");
		
	}
	
}
public class Smarttvinterfacepgm {

	public static void main(String[] args) {
		
		Smarttv ob=new Smarttv();
		ob.bluetooth();
		ob.voiceassistant();
		ob.volumebutton();
		ob.selectbutton();
		

	}

}
