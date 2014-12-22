import java.util.Date;
/*
Project Euler Problem 131
=========================

There are some prime values, p, for which there exists a positive integer,
n, such that the expression n^3 + n^2p is a perfect cube.

For example, when p = 19, 8^3 + 8^2 * 19 = 12^3.

What is perhaps most surprising is that for each prime with this property
the value of n is unique, and there are only four such primes below
one-hundred.

How many primes below one million have this remarkable property?
*/

public class Euler131 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
