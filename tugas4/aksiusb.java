package tugas4;

import java.util.Scanner;

class MotherBoard {
    // static nested class
    static class USB{
        int TotalPorts(int usb2, int usb3){
            return usb2 + usb3;
        }
    }
}

public class aksiusb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int usb3 = input.nextInt();
		int usb2 = input.nextInt();
        input.close();

		MotherBoard.USB usb = new MotherBoard.USB(); 
		int total = usb.TotalPorts(usb2, usb3);
		System.out.println("Total Ports = " + total);
    }
}
