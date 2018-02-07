public class Printer implements IConnect{

    public String print(String data){
        return "printing: " + data;
    }

    public String connect(String networkName){
        return "printer connecting to network: " + networkName;
    }
}
