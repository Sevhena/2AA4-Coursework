public class CProtocol extends CerebusProtocol{

    private final int CEREBUS_CONS;
    private final int key;

    public CProtocol(int CEREBUS_CONS, int key){
        this.CEREBUS_CONS = CEREBUS_CONS;
        this.key = key;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public int getConstant() {
        return CEREBUS_CONS;
    }
}
