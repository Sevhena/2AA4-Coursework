public class Runner {

    public static void main(String[] args) {

        int[] CEREBUS_ONE = {18};
        int[] CEREBUS_TWO = {31};
        int CEREBUS_INIT_VALUE = 32;
        int CEREBUS_ALPH_SIZE = 128;

        int[] OUROBOROS_ONE = {3, 1, 0, 2};
        int[] OUROBOROS_TWO = {2, 5, 4, 1, 3, 0};

        Cerebus cerebus = new Cerebus();
        Ouroboros ouroboros = new Ouroboros();
        Site1 alpha = new Site1(cerebus,ouroboros);
        Site2 beta = new Site2(cerebus,ouroboros);
        Site3 gamma = new Site3(cerebus,ouroboros);

        CerebusFactory factoryC = new CerebusFactory();
        OuroborosFactory factoryO = new OuroborosFactory();

        CProtocol prot1 = factoryC.createProtocol(CEREBUS_ONE, 0);
        CProtocol prot2 = factoryC.createProtocol(CEREBUS_TWO, 1);
        OProtocol prot3 = factoryO.createProtocol(OUROBOROS_ONE,0);
        OProtocol prot4 = factoryO.createProtocol(OUROBOROS_TWO,1);

        cerebus.addProtocol(prot1);
        cerebus.addProtocol(prot2);
        ouroboros.addProtocol(prot3);
        ouroboros.addProtocol(prot4);

        alpha.display();
        beta.display();
        gamma.display();

        cerebus.changeProtocol();

        alpha.display();
        beta.display();
        gamma.display();

        cerebus.changeProtocol();

        alpha.display();
        beta.display();
        gamma.display();

        cerebus.changeProtocol();

        alpha.display();
        beta.display();
        gamma.display();

    }

}