public class Main {
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        Feeder g=new Feeder(500);
        System.out.println(g);
        System.out.println(g.getCurrentFood());

        int numBirds = 10;
        int numDays = 4;

//        g.simulateOneDay(12);

//        System.out.println(Math.random());

//        double random = Math.random() * 10;
//        System.out.println(random);
//
//        int random = (int) Math.random() * 10;
//        System.out.println(random);

//        int random = (int)(Math.random() * 10);
//        System.out.println(random);
//
//        int random = (int)(Math.random() * 10 + 1);
//        System.out.println(random);
//
//        int random = (int)(Math.random() * 50 + 10);
//        System.out.println(random);
//        System.out.println(Math.random() < 0.05);

//        g.simulateOneDay(12);
//        System.out.println(g.getCurrentFood());
//
//        Feeder h = new Feeder(1000);
//        h.simulateOneDay(22);
//        System.out.println(h.getCurrentFood());

//        Feeder i = new Feeder(100);
//        i.simulateOneDay(5);
//        System.out.println(i);


        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10,4));

        Feeder m=new Feeder(250);
        System.out.println(m.simulateManyDays(10,5));

        Feeder n=new Feeder(250);
        System.out.println(n.simulateManyDays(10,5));

    }}




