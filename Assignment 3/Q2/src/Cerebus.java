import java.util.ArrayList;
import java.util.Random;

public class Cerebus extends AbstractEncryption {

    Random rand;
    private CerebusProtocol cProtocol;
    private ArrayList<CerebusProtocol> cProtocols = new ArrayList<>();

    public Cerebus(){
        rand = new Random();
    }

    public void addProtocol(CerebusProtocol cProtocol){
        cProtocols.add(cProtocol);
    }

    public CerebusProtocol getProtocol() {
        return cProtocol;
    }

    public void changeProtocol(){
        cProtocol = cProtocols.get(rand.nextInt(cProtocols.size()));
        notifySites();
    }
}
