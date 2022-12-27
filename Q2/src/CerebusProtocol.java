public abstract class CerebusProtocol implements Protocol{

    private static final int CEREBUS_INIT_VALUE = 32;
    private static final int CEREBUS_ALPH_SIZE = 128;

    public abstract int getConstant();

    public int getInitValue(){
        return CEREBUS_INIT_VALUE;
    }

    public int getAlphSize(){
        return CEREBUS_ALPH_SIZE;
    }
}
