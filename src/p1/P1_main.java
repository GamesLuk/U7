package p1;

public class P1_main {

    public static void main(String[] args) {

        int z1 = 3;
        int n1 = 4;
        int z2 = 2;
        int n2 = 5;

        multFrac(z1, n1, z2, n2);

        Bruch a = new Bruch(3, 4);
        Bruch b = new Bruch(2, 5);

        multFrac(a, b);

        System.out.println("Bruch a.toString: " + a.toString());
        System.out.println(a);

    }

    public static void multFrac(int z1, int n1, int z2, int n2) {
        int z = z1 * z2;
        int n = n1 * n2;
        System.out.println("Result: " + z + "/" + n);
    }

    public static void multFrac(Bruch a, Bruch b) {
        int z = a.z * b.z;
        int n = a.n * b.n;
        System.out.println("Result: " + z + "/" + n);
    }

}
