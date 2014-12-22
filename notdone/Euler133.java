import java.util.Date;
/*
Project Euler Problem 133
=========================

A number consisting entirely of ones is called a repunit. We shall define
R(k) to be a repunit of length k; for example, R(6) = 111111.

Let us consider repunits of the form R(10^n).

Although R(10), R(100), or R(1000) are not divisible by 17, R(10000) is
divisible by 17. Yet there is no value of n for which R(10^n) will divide
by 19. In fact, it is remarkable that 11, 17, 41, and 73 are only four
primes below one-hundred that can ever be a factor of R(10^n).

Find the sum of all the primes below one-hundred thousand that will never
be a factor of R(10^n).
*/

public class Euler133 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
