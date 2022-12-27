public class OuroborosFactory implements AbstractProtocolFactory{
    @Override
    public OProtocol createProtocol(int[] constant, int key) {
        return new OProtocol(constant,key);
    }
}
