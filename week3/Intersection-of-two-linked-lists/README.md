1. Problem

We need to find the node where two linked lists intersect. If they do not intersect, we return null.

2. Approach and Challenges

I used two pointers, pA and pB. The first pointer starts at list A, and the second pointer starts at list B.

Both pointers move to the next node. When one pointer reaches the end of its list, it starts again from the beginning of the other list.

This helps both pointers travel the same distance. If the lists intersect, they will meet at the intersection node. If there is no intersection, both pointers will eventually become null.

At first, I tried using a HashSet to store the nodes of the first list and check them against the second list. This approach worked, but it required extra memory. Then I changed to the two-pointer approach, which uses less memory and makes the solution simpler.

Example

List A: [4, 1, 8, 4, 5]

List B: [5, 6, 1, 8, 4, 5]

Both pointers move through the lists and switch to the other list when they reach the end. Eventually, they meet at the node with value 8, which is the intersection node.

3. Time and Space Complexity

Time Complexity: O(m + n), because both pointers travel through the lists.

Space Complexity: O(1), because I only use two pointers and do not need extra data structures.

4. Reflection and Improvement

This solution is efficient because it uses constant extra space. Compared to my first approach with a HashSet, the two-pointer method makes the code simpler and uses less memory. It is an optimal solution for this problem.
