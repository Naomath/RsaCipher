import java.util.Random;

public class MakeE {

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //1 < E < L
    //gcd(E,L) = 1

    private int e;

    public int getE() {
        return e;
    }


    public MakeE(int l) {
        //constructor
        this.e = makeE(l);

    }

    private int makeE(int l) {
        Random random = new Random();

        boolean done = false;

        int number = 0;

        while (!done) {

            number = random.nextInt(l) + 1;
            //random.nextInt(l) make a number between 1 and l-1;

            if (Gcd.gcd(number, l) == 1) {
                //In this situation, it has done.
                done = true;
            }
        }

        return number;

    }


}
