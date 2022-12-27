import java.util.ArrayList;

public class Mystery1{

    private ArrayList<String[]> S;

    public Mystery1(){
        S = new ArrayList<String[]>();
    }

    public void f1(String s1, String s2){
        if (!s1.equals(s2)) {
            String[] X = {s1,s2};
            for (String[] x: S){
                if (x[0].equals(s1) && x[1].equals(s2))
                    return;
            }
            S.add(X);
        }
    }

    public int f2(String s){
        int count = 0;
        for (String[] x: S){
            if (x[1].equals(s))
                count++;
        }
        return count;
    }

    public boolean f3(String s1, String s2){
        String[] L = {s1,s2};
        return P(L);
    }

    public boolean P(String[] L){
        boolean inS = true;
        for (int i = 1; i < L.length && inS; i++){
            for (String[] x : S){
                if (!L[i-1].equals(x[0]) || !L[i].equals(x[1])) {
                    inS = false;
                    break;
                }
                if(!L[L.length-1].equals(x[0]) || !L[0].equals(x[1])){
                    inS = false;
                    break;
                }
            }
        }
        return inS;
    }

    /*public void display(){
        for (String[] x : S){
            System.out.println("[" +x[0] +" " +x[1] +"]");
        }
    }*/

}
