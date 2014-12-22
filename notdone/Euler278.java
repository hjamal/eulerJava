import java.util.Date;
/*
Project Euler Problem 278
=========================

Given the values of integers 1 < a[1] < a[2] <... < a[n], consider the
linear combination
q[1]a[1] + q[2]a[2] + ... + q[n]a[n] = b, using only integer values q[k] ≥
0.

Note that for a given set of a[k], it may be that not all values of b are
possible.
For instance, if a[1] = 5 and a[2] = 7, there are no q[1] ≥ 0 and q[2] ≥ 0
such that b could be
1, 2, 3, 4, 6, 8, 9, 11, 13, 16, 18 or 23.
In fact, 23 is the largest impossible value of b for a[1] = 5 and a[2] =
7.
We therefore call f(5, 7) = 23.
Similarly, it can be shown that f(6, 10, 15)=29 and f(14, 22, 77) = 195.

Find ∑ f(p*q,p*r,q*r), where p, q and r are prime numbers and p < q < r <
5000.
*/

public class Euler278 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
