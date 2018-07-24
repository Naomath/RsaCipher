public class Main {

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //N = p * q (p and q are prime numbers.)

    //L = lcm(p-1, q-1)

    public static int N = 0;

    public static int L = 0;

    public static void main(String[] args) {
        //central processing
        MakeN makeN = new MakeN();

        N = makeN.getN();

        MakeL makeL = new MakeL(makeN.getP() - 1, makeN.getQ() - 1);

        L = makeL.getL();
    }
}
