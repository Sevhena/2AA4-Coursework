import java.util.ArrayList;

public abstract class AbstractEncryption {

    private ArrayList<Site> sites = new ArrayList<>();

    public void add(Site site) {
        sites.add(site);
    }

    public void remove(Site site) {
        sites.remove(site);
    }

    protected void notifySites() {
        for(Site site : sites) {
            site.update();
        }
    }
}
