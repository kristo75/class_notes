import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxNumberOfDevices();

    public Network(String name){
        this.devices = new ArrayList<>();
        this.name = name;
        this.maxnumberofdevices = 5;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        devices.add(device);
    }

    public void disconnectAll(){
        devices.clear();
    }

    public void maxNumberOfDevices(){
        if this.maxNumberOfDevices < 0;
        return "no more available spaces";
    }
}