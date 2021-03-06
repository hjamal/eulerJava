import java.util.Date;
/*
Project Euler Problem 210
=========================

   Consider the set S(r) of points (x,y) with integer coordinates satisfying
   |x| + |y| ≤ r.
   Let O be the point (0,0) and C the point (r/4,r/4).
   Let N(r) be the number of points B in S(r), so that the triangle OBC has
   an obtuse angle, i.e. the largest angle α satisfies 90°<α<180°.
   So, for example, N(4)=24 and N(8)=100.

   What is N(1,000,000,000)?
*/

public class Euler210 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
