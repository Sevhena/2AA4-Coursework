public interface Site {

    public void update();

    public String encryptCerebus(CerebusProtocol cProtocol, String message);

    public String encryptOuroboros(OuroborosProtocol oProtocol, String message);

    public String decryptCerebus(CerebusProtocol cProtocol, String message);

    public String decryptOuroboros(OuroborosProtocol oProtocol, String message);

}
