public class Main {
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        Feeder g=new Feeder(500);
        System.out.println(g);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
//        System.out.println(Math.random());

//        double random = Math.random() * 10;
//        System.out.println(random);
//
//        int random = (int) Math.random() * 10;
//        System.out.println(random);

//        int random = (int)(Math.random() * 10);
//        System.out.println(random);

        int random = (int)(Math.random() * 10 + 1);
        System.out.println(random);
    }}





