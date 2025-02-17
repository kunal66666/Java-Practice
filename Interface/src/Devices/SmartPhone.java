package Devices;

public class SmartPhone implements Camera,MusicPlayer,Phone
{


    @Override
    public void takePicture() {
        System.out.println("Taking picture");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");

    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");

    }

    @Override
    public void makecall(String number) {
        System.out.println("Making call to " + number);


    }

    @Override
    public void endcall() {
        System.out.println("Ending call");

    }
}
