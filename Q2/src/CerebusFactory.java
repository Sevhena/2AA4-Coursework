public class CerebusFactory implements AbstractProtocolFactory{
    @Override
    public CProtocol createProtocol(int[] constant, int key) {
        return new CProtocol(getConstant(constant), key);
    }

    private int getConstant(int[] constantList){
        return constantList[0];
    }
}
