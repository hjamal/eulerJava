import java.util.Date;
/*
Project Euler Problem 155
=========================

An electric circuit uses exclusively identical capacitors of the same
value C.
The capacitors can be connected in series or in parallel to form
sub-units, which can then be connected in series or in parallel with other
capacitors or other sub-units to form larger sub-units, and so on up to a
final circuit.

Using this simple procedure and up to n identical capacitors, we can make
circuits having a range of different total capacitances. For example,
using up to n=3 capacitors of 60 F each, we can obtain the following 7
distinct total capacitance values:

If we denote by D(n) the number of distinct total capacitance values we
can obtain when using up to n equal-valued capacitors and the simple
procedure described above, we have: D(1)=1, D(2)=3, D(3)=7 ...

Find D(18).

Reminder : When connecting capacitors C[1], C[2] etc in parallel, the
total capacitance is C[T] = C[1] + C[2] +...,
whereas when connecting them in series, the overall capacitance is given
by:
*/

public class Euler155 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
