public class Gcd {

    public static int gcd(int p, int q) {
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
