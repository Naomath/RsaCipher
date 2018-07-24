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

    public int makeL(int p, int q) {
        return p * q / gcd(p, q);
    }

    public int gcd(int p, int q) {
        //it's using  Euclidean Algorithm.

        int dividedNumber = Math.max(p, q);

        int dividingNumber = Math.min(p, q);

        int quotient;

        int remainder;

        //dividedNumber = dividingNumber * quotient + remainder.

        boolean done = false;

        while (!done) {
            quotient = dividedNumber / dividingNumber;
            remainder = dividedNumber - dividingNumber * quotient;

            if (remainder == 0) {
                done = true;
            } else {
                dividedNumber = dividingNumber;
                dividingNumber = remainder;
            }
        }

        return dividingNumber;

    }

}
