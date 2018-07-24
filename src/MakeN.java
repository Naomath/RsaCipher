import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Random;

public class MakeN {
    //in this class , it make N.

    //Cryptogram = Plaintext ˆ E mod N

    //Plaintext = Cryptogram ˆ D mod N

    //N = p * q (p and q are prime numbers.)

    private int n;

    public int getN() {
        return n;
    }


    private int p;

    public int getP() {
        return p;
    }


    private int q;

    public int getQ() {
        return q;
    }


    public MakeN() {
        //constructor
        this.n = makeN();
    }

    public int makeN() {

        p = makeP();

        q = makeQ();

        return p * q;

    }

    public int makeP() {

        Random random = new Random();

        boolean done = false;

        int p = 0;

        while (!done) {
            //if it make P, it substitutes "true" for "done".

            p = random.nextInt(100);
            //the upper limited number of p is 100.

            //it judge whether p is a prime number or not.

            done = isPrime(p);
        }

        return p;

    }

    public int makeQ() {

        Random random = new Random();

        boolean done = false;

        int q = 0;

        while (!done) {
            //if it make Q, it substitutes "true" for "done".

            q = random.nextInt(100);
            //the upper limited number of q is 100.

            //it judge whether q is a prime number or not.

            done = isPrime(q);
        }

        return q;
    }

    public boolean isPrime(int number) {

        //it judge whether "number" is a prime number or not.
        //return "true" if a prime number, return "false" if a multiple

        //now it's using my method. but it holds because of the small of "number".
        //so if it's big, it will be using 'Miller-Rabin prime number judge'
        //TODO:Miller-Rabin Prime NUmber Judge

        boolean isPrime = true;

        double dNumber = (double) number;

        if (number == 0 && number == 1) {

            isPrime = false;

        } else {

            for (int i = 2; i <= Math.sqrt(dNumber); i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }

        return isPrime;
    }
}
