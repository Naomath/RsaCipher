public class MakeD {

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //1 < D < L

    //E * D mod L = 1

    private int d;

    public int getD() {
        return d;
    }

    public MakeD(int e, int l) {
        this.d = makeD(e, l);
    }

    private int makeD(int e, int l) {

        boolean done = false;

        int i = 1;

        int d = 1;

        while (!done) {
            int dividedNumber = l * i + 1;

            int remainder = dividedNumber % e;

            if (remainder == 0) {
                //In this situation , it has done.
                d = dividedNumber / e;

                done = true;

            } else {
                i++;
            }
        }

        return d;
    }
}
