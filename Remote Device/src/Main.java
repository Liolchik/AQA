public class Main {
    public static void main(String args[]) {

        TV myTV = new TV("LG");

        RemoteController rm = new RemoteController();

        rm.connectDevice(myTV);

        rm.powerOn();

        rm.switchTheChannel(12);

        rm.upVolume();

        rm.powerOff();
    }
}
