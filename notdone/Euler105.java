import java.util.Date;
/*
Project Euler Problem 105
=========================

Let S(A) represent the sum of elements in set A of size n. We shall call
it a special sum set if for any two non-empty disjoint subsets, B and C,
the following properties are true:

 1. S(B) S(C); that is, sums of subsets cannot be equal.
 2. If B contains more elements than C then S(B) > S(C).

For example, {81, 88, 75, 42, 87, 84, 86, 65} is not a special sum set
because 65 + 87 + 88 = 75 + 81 + 84, whereas {157, 150, 164, 119, 79, 159,
161, 139, 158} satisfies both rules for all possible subset pair
combinations and S(A) = 1286.

Using sets.txt, a 4K text file with one-hundred sets containing seven to
twelve elements (the two examples given above are the first two sets in the
file), identify all the special sum sets, A[1], A[2], ..., A[k], and find the
value of S(A[1]) + S(A[2]) + ... + S(A[k]).

NOTE: This problem is related to problems 103 and 106.
*/

public class Euler105 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
