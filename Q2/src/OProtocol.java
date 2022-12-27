public class OProtocol extends OuroborosProtocol{

    private final int key;
    private final int[] OUROBOROS_CONS;

    public OProtocol(int[] OUROBOROS_CONS, int key){
        this.OUROBOROS_CONS = OUROBOROS_CONS;
        this.key = key;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public int[] getList() {
        return OUROBOROS_CONS;
    }
}
