import Devices.SmartPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public interface Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makecall("344");

    }
}