public class Site2 implements Site{

    private CerebusProtocol cProtocol;
    private OuroborosProtocol oProtocol;
    Cerebus cerebus;
    Ouroboros ouroboros;

    public Site2(Cerebus cerebus, Ouroboros ouroboros){
        this.cerebus = cerebus;
        this.ouroboros = ouroboros;
        cerebus.add(this);
        ouroboros.add(this);
        this.cProtocol = cerebus.getProtocol();
        this.oProtocol = ouroboros.getProtocol();
    }

    public void display(){
        System.out.println("Cerebus: "+cProtocol.getKey());
        System.out.println("Ouroboros: "+oProtocol.getKey());
    }

    public String sendMessageCerebus(String message) {
        return encryptCerebus(cProtocol,message);
    }

    public String receiveMessageCerebus(String message) {
        return decryptCerebus(cProtocol, message);
    }

    public String sendMessageOuroboros(String message) {
        return encryptOuroboros(oProtocol, message);
    }

    public String receiveMessageOuroboros(String message) {
        return decryptOuroboros(oProtocol, message);
    }

    @Override
    public void update() {
        this.cProtocol = cerebus.getProtocol();
        this.oProtocol = ouroboros.getProtocol();
    }

    @Override
    public String encryptCerebus(CerebusProtocol cProtocol, String message) {
        int am = cProtocol.getConstant();

        StringBuilder out = new StringBuilder();
        String use = message.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a + am - cProtocol.getInitValue()) % cProtocol.getAlphSize()) + cProtocol.getInitValue())+"");
        }
        return out.toString();
    }

    @Override
    public String decryptCerebus(CerebusProtocol cProtocol, String message) {
        int am = cProtocol.getConstant();

        StringBuilder out = new StringBuilder();
        String use = message.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a - am  - cProtocol.getInitValue() + cProtocol.getAlphSize()) % cProtocol.getAlphSize()) + cProtocol.getInitValue())+"");
        }
        return out.toString();
    }

    @Override
    public String encryptOuroboros(OuroborosProtocol oProtocol, String message) {
        int[] am = oProtocol.getList();

        StringBuilder out = new StringBuilder();
        String use = message + new String(new char[am.length - (message.length() % am.length)]).replace("\0", " ");
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[j] = use.charAt(i + am[j]);
            }
            out.append(new String(next));
        }
        return out.toString();
    }

    @Override
    public String decryptOuroboros(OuroborosProtocol oProtocol, String message) {
        int[] am = oProtocol.getList();

        StringBuilder out = new StringBuilder();
        String use = message+"";
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[am[j]] = use.charAt(i + j);
            }
            out.append(new String(next));
        }
        return out.toString();
    }


}
