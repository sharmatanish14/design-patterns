package commandPattern;

public class Person {
    public static void main(String[] args) {

        Television television = new Television();
        OnCommand onCommand = new OnCommand(television);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
    }
}
