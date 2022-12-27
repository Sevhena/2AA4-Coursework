import java.util.ArrayList;
import java.util.Random;

public class Ouroboros extends AbstractEncryption{

    Random rand;
    private OuroborosProtocol oProtocol;
    private ArrayList<OuroborosProtocol> oProtocols = new ArrayList<>();

    public Ouroboros(){
        rand = new Random();
    }

    public void addProtocol(OuroborosProtocol oProtocol){
        oProtocols.add(oProtocol);
    }

    public OuroborosProtocol getProtocol() {
        return oProtocol;
    }

    public void changeProtocol(){
        oProtocol = oProtocols.get(rand.nextInt(oProtocols.size()));
        notifySites();
    }

}

