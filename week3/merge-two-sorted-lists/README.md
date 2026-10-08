1. Problem
The goal is to merge two sorted linked lists into one sorted linked list.
We need to connect the nodes from both lists in the correct order.
2. Approach
I used a dummy node to make the process easier.
Then I compare the current nodes of both lists.
If the value in the first list is smaller, I add this node to the result.
If the value in the second list is smaller, I add this node instead.
After adding a node, I move the pointer to the next node.
When one list becomes empty, I add the remaining part of the other list to the end.
 Example
list1 = [1, 2, 4]

list2 = [1, 3, 4]

 Step 1
Compare 1 and 1.
Take 1 from list1.
list1 moves to 2.
Result is 1

Step 2
Compare 2 and 1.
Take 1 from list2.
list2 moves to 3.
Result is 1 -> 1

 Step 3
Compare 2 and 3.
Take 2 from list1.
list1 moves to 4.
Result is 1 -> 1 -> 2

 Step 4
Compare 4 and 3.
Take 3 from list2.
list2 moves to 4.
Result is 1 -> 1 -> 2 -> 3

Step 5
Compare 4 and 4.
Take 4 from list1.
list1 becomes empty.
Result is 1 -> 1 -> 2 -> 3 -> 4

Step 6
One list is empty, so we add the remaining node from list2.
Final result is
[1, 1, 2, 3, 4, 4]

 3. Time Complexity
The time complexity is O(n + m).
We go through every node in both lists once.
Here n is the number of nodes in the first list and m is the number of nodes in the second list.

4. Space Complexity

The space complexity is O(1).
We only use a few pointers and do not create new nodes.
We reuse the existing nodes from the two lists.

 5. Reflection
There is no faster approach because we need to check the nodes from both lists.
Compared to a brute force solution, this approach does not create new nodes.
Instead, we connect the existing nodes using pointers.
The final complexity is O(n + m) time and O(1) extra space.
