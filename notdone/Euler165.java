import java.util.Date;
/*
Project Euler Problem 165
=========================

A segment is uniquely defined by its two endpoints.
By considering two line segments in plane geometry there are three
possibilities:
the segments have zero points, one point, or infinitely many points in
common.

Moreover when two segments have exactly one point in common it might be
the case that that common point is an endpoint of either one of the
segments or of both. If a common point of two segments is not an endpoint
of either of the segments it is an interior point of both segments.
We will call a common point T of two segments L[1] and L[2] a true
intersection point of L[1] and L[2] if T is the only common point of L[1]
and L[2] and T is an interior point of both segments.

Consider the three segments L[1], L[2], and L[3]:

L[1]: (27, 44) to (12, 32)
L[2]: (46, 53) to (17, 62)
L[3]: (46, 70) to (22, 40)

It can be verified that line segments L[2] and L[3] have a true
intersection point. We note that as the one of the end points of L[3]:
(22,40) lies on L[1] this is not considered to be a true point of
intersection. L[1] and L[2] have no common point. So among the three line
segments, we find one true intersection point.

Now let us do the same for 5000 line segments. To this end, we generate
20000 numbers using the so-called "Blum Blum Shub" pseudo-random number
generator.

s[0] = 290797

s[n+1] = s[n] * s[n] (modulo 50515093)

t[n] = s[n] (modulo 500)

To create each line segment, we use four consecutive numbers t[n]. That
is, the first line segment is given by:

(t[1], t[2]) to (t[3], t[4])

The first four numbers computed according to the above generator should
be: 27, 144, 12 and 232. The first segment would thus be (27,144) to
(12,232).

How many distinct true intersection points are found among the 5000 line
segments?
*/

public class Euler165 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
