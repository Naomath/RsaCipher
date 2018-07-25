import java.util.Scanner;

public class Main {

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //N = p * q (p and q are prime numbers.)

    //L = lcm(p-1, q-1)

    public static double PLAIN_TEXT = 0d;
    //In this version, plaintext is an double;

    public static double CRYPTOGRAM = 0d;

    public static int N = 0;

    public static int L = 0;

    public static int E = 0;

    public static int D = 0;

    public static void main(String[] args) {
        //central processing

        Scanner scanner = new Scanner(System.in);

        System.out.println("平文を入力してください(数字で)");

        PLAIN_TEXT = scanner.nextDouble();

        prepareKeys();

        System.out.println("N = " + N);

        System.out.println("L = " + L);

        System.out.println("E = " + E);

        System.out.println("D = " + D);

        CRYPTOGRAM = encryption();

        System.out.println("暗号文は" + CRYPTOGRAM + "です");

    }

    public static void prepareKeys() {
        MakeN makeN = new MakeN(PLAIN_TEXT);

        N = makeN.getN();

        MakeL makeL = new MakeL(makeN.getP() - 1, makeN.getQ() - 1);

        L = makeL.getL();

        MakeE makeE = new MakeE(L);

        E = makeE.getE();

        MakeD makeD = new MakeD(E, L);

        D = makeD.getD();
    }

    public static double encryption() {

        double dE = (double) E;

        return Math.pow(PLAIN_TEXT, dE) % N;
        //TODO:Math.pow(PLAIN_TEXT, dE) is too enormous to "double";
    }
}
