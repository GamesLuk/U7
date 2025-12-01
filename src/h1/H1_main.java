package h1;

public class H1_main {

    public static void main(String[] args) {

        int a = -16;

        Zahl zahl = new Zahl();
        zahl.num = a;
        zahl.setEven();
        zahl.setPositive();
        zahl.setSmall();

        System.out.println("Zahl: " + zahl.num);
        System.out.println("Even: " + zahl.even);
        System.out.println("Positive: " + zahl.positive);
        System.out.println("Small: " + zahl.small);

    }

}
