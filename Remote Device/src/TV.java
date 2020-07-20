public class TV extends TVDevice {
    int volumeLevel;
    int channelNumber;

    public TV(String modelName) {
        this.modelName = modelName;

        this.volumeLevel = 10;
        this.channelNumber = 1;
    }

    //  Device Interface implementation
    public void powerOn() {
        this.isOn = true;
        System.out.println("Power On");
    }

    public void powerOff() {
        this.isOn = false;
        System.out.println("Power Off");
    }

    public void setChannel(int channel) {
        this.channelNumber = channel;
    }

    public void currentChanel() {
        System.out.println("Current Channel is:" + this.channelNumber);
    }

    //  Volume Interface implementation
    public void upVolume() {
        this.volumeLevel++;
        System.out.println("Volume is added");
    }

    public void downVolume() {
        this.volumeLevel--;
        System.out.println("Volume is down");
    }

   public void mute() {
        System.out.println("Volume is muted");
    }
}
