public class Main {

    public static void main(String[] args) {
        /*Mystery2 test2 = new Mystery2();
        test2.add(5.5,7);
        test2.add(7.3,9);
        test2.add(7.1,1);
        test2.add(15.2,2);
        test2.add(10.93,5);
        test2.add(1.57,9);
        test2.add(7.9,7);
        test2.add(11.91,2);

        test2.display();
        double next = test2.getNext();
        System.out.println(next);
        test2.display();
        next = test2.getNext();
        System.out.println(next);
        test2.display();
        next = test2.getNext();
        System.out.println(next);
        test2.display();*/

        Mystery1 test1 = new Mystery1();
        test1.f1("hello","bye");
        test1.f1("hello","hi");
        test1.f1("hello","hello");
        test1.f1("drama","queen");
        test1.f1("void","queen");
        test1.f1("comet","queen");
        test1.f1("drama","queen");
        int count = test1.f2("queen");
        System.out.println(count);
        //test1.display();
        System.out.println(test1.f3("void", "queen"));

    }
}