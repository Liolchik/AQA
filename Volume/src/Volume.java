public interface Volume {
    void changeVolume(double value);
}
public interface State {
    void on();
    void off();
}
public class MyDevice implements Volume, State {

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public void changeVolume(double value) {
    }
}
public class Main {
    public static void main(String args[]) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(2);
        myDevice.off();
    }
}
