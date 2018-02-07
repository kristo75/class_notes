public class InternetRadio implements IConnect {

    public String connect(String networkName){
        return "connecting to " + networkName;
    }

    public String tune(String stationName) {
        return "connecting to " + stationName;
    }
}
