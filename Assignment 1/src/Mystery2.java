import java.util.ArrayList;

public class Mystery2 {

    class Triple {
        private double x1;
        private int x2;
        private int x3;

        public Triple(double x1, int x2, int x3){
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
        }

        public double getX1() {
            return x1;
        }

        public int getX2() {
            return x2;
        }

        public int getX3() {
            return x3;
        }
    }
    private ArrayList<Triple> S;
    int MAX_X2 = 10;

    public Mystery2(){
        S = new ArrayList<Triple>();
    }

    public void add(double value, int n){
        int z = 0;
        if (S.size() == 0)
            z = 100;
        else {
            for (int i = S.size()-1; i >= 0; i--){
                if(S.get(i).getX2() == n){
                    z = S.get(i).getX3()-1;
                    break;
                }
                if (i == 0) {
                    z = 100; //arbitrary number
                }
            }
        }
        S.add(new Triple(value,n,z));
    }

    public double getNext(){
        double x1prime = 0;

        int minX2 = 11;
        for (Triple x: S){
            if (x.getX2() < minX2)
                minX2 = x.getX2();
        }
        for (int i = S.size()-1; i >= 0; i--){
            if(S.get(i).getX2() == minX2) {
                x1prime = S.get(i).getX1();
                S.remove(i);
                break;
            }
        }
        return x1prime;
    }

    /*public void display(){
        for (Triple x : S){
            System.out.println("[" +x.getX1() +" " +x.getX2() +" " +x.getX3() +"]");
        }
    }*/

}
