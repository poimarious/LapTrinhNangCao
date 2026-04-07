import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        
        Device[] devices = new Device[n];

        for(int i = 0; i < n; i++) {
            String type = sc.next();
            
            switch (type) {
                case "L":
                    devices[i] = new SmartLight(sc.next(), sc.next(), true, 100);
                    break;
                case "AC":
                    devices[i] = new AirConditioner(sc.next(), sc.next(), true, true);
                    break;
                case "S":
                    devices[i] = new SmartSpeaker(sc.next(), sc.next(), true, 100, true);
                    break;

                default:
                    devices[i] = new SmartCurtain(sc.next(), sc.next(), true);
                    break;
            }
        }
        System.out.println();
        System.out.println("Turn Off All Devices:");
        for(Device d : devices) {
            d.turn();
        }
        System.out.println();
        System.out.println("Setup wifi:");
        for(Device d : devices) {
            if(d instanceof WifiConnectable) {
                ((WifiConnectable) d).connectWifi();
                
            }
        }
    
    }
 }
