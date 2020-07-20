public class RemoteController implements Device, Volume {

    private TVDevice tvDevice;

    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    public void disconnectDevice() {
        this.tvDevice = null;
    }

    private boolean checkIfDeviceConnected() {
        return this.tvDevice != null;
    }

    public void switchTheChannel(int channel) {
        this.tvDevice.setChannel(channel);
    }

    //  Device Interface implementation
    public void powerOn() {
        this.tvDevice.powerOn();
    }

    public void powerOff() {
        this.tvDevice.powerOff();
    }

    public void setChannel(int channel) {
        this.tvDevice.setChannel(channel);
    }

    public void currentChanel() {
        this.tvDevice.currentChanel();
    }

    //  Volume Interface implementation
    public void upVolume() {
        this.tvDevice.upVolume();
    }

    public void downVolume() {
        this.tvDevice.downVolume();
    }

    public void mute() {
        System.out.println("Volume is muted");
    }
}
