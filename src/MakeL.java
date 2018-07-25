public class MakeL {

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //L = lcm(p-1, q-1)

    private int l;

    public int getL() {
        return l;
    }


    public MakeL(int p, int q) {
        //constructor
        this.l = makeL(p, q);
    }

    private int makeL(int p, int q) {
        return p * q / Gcd.gcd(p, q);
    }

}
