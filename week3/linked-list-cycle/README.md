1. Problem

We need to check if a linked list has a cycle.
A cycle means that after following the next pointer, we can come back to a node that we already visited.

2. Approach

I used the slow and fast pointer method.
The slow pointer moves one step at a time.
The fast pointer moves two steps at a time.
If there is a cycle, the fast pointer will eventually meet the slow pointer.
If there is no cycle, the fast pointer will reach null and the program will return false.

Tracing Example
The list is [3, 2, 0, -4]
The last node connects back to node 2.
Start
Both pointers start at 3.

slow = 3
fast = 3

Step 1

Slow moves one step to 2.
Fast moves two steps to 0.

slow = 2
fast = 0

The pointers are not equal.

Step 2

Slow moves to 0.
Fast moves two steps from 0 to -4 and then to 2.

slow = 0
fast = 2

The pointers are not equal.

Step 3

Slow moves to -4.
Fast moves to 0.

slow = -4
fast = 0

The pointers are not equal.

Step 4

Slow moves to 2.
Fast moves to 2.

The pointers are equal, so a cycle is found.
The method returns true.

3. Time Complexity

The time complexity is O(n).
We go through the nodes until we find a cycle or reach the end of the list.

4. Space Complexity

The space complexity is O(1).
We only use two pointers, slow and fast.
We do not need to create another data structure.

5. Reflection

This is an efficient solution because it uses good time and space complexity.
A different approach would be to store every visited node in a hash set.
That would need O(n) extra space.
With the slow and fast pointer method, we only need O(1) extra space.
The final complexity is O(n) time and O(1) space.
