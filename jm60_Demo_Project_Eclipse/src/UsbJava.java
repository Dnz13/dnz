import com.lucasF.JCommUSB_2_0.USBDevice;

public class UsbJava {

	public static void main(String[] args) {
		//deneme 
		String szPath = "";
		try{
			szPath = USBDevice.getAttachedDevicePath(0);

			System.out.println("Device Path of Device at index 0 = "+ szPath);
			USBDevice myUSB = new USBDevice(szPath);

			System.out.println("connected?"+myUSB.deviceIsConnected()); 
//			github deneme 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
