1. Problem

We need to remove all nodes that have the same value as the given val and return the updated linked list.

2. Approach and Challenges

I used a dummy node that points to the head of the list. This makes it easier to remove nodes, especially when the first node needs to be deleted.

I used a pointer called current to go through the list. If the next node has the value we want to remove, I skip it by changing current.next to current.next.next. If the value is different, I move current to the next node.

At first, I tried solving the problem without a dummy node. However, removing the first node made the code more complicated because I needed to handle it separately. Using a dummy node made the solution simpler.

Example

Input: [1, 2, 6, 3, 4, 5, 6]

val = 6

I go through the list and check each next node. When I find a node with value 6, I skip it. After removing both nodes with value 6, the list becomes [1, 2, 3, 4, 5].

3. Time and Space Complexity

Time Complexity: O(n), because I go through the list once.

Space Complexity: O(1), because I only use a dummy node and a pointer.

4. Reflection and Improvement

This solution is efficient because it removes all matching nodes in one traversal. Using a dummy node makes the code easier to understand and helps avoid problems when the head needs to be removed.
