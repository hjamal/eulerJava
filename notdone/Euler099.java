import java.util.Date;
/*
Project Euler Problem 99
========================

Comparing two numbers written in index form like 2^11 and 3^7 is not
difficult, as any calculator would confirm that 2^11 = 2048 < 3^7 = 2187.

However, confirming that 632382^518061 > 519432^525806 would be much more
difficult, as both numbers contain over three million digits.

Using base_exp.txt, a 22K text file containing one thousand lines with a
base/exponent pair on each line, determine which line number has the
greatest numerical value.

NOTE: The first two lines in the file represent the numbers in the example
given above.
*/

public class Euler099 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
