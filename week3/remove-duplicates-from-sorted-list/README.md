Remove Duplicates from Sorted List

1. Problem

We need to remove duplicate values from a sorted linked list. Each value should appear only once. The list should stay sorted.

2. Approach

I used one pointer called current to go through the list.

Because the list is sorted, duplicate values are next to each other. If the current value is equal to the next value, I skip the duplicate node by changing the next pointer.

If the values are different, I move current to the next node.

At first, I tried using nested loops to check duplicates, but it made the code more complicated and caused some pointer problems. Then I used one loop, which made the solution easier.

Example

Input is [1, 1, 2]

Step 1

Current is at 1 and the next value is also 1. They are equal, so I skip the second 1.

The list becomes [1, 2].

Step 2

Current is still at 1 and the next value is 2. They are different, so I move current to 2.

Step 3

Current is at 2 and the next node is null. The loop stops.

The final result is [1, 2].

3. Time Complexity

The time complexity is O(n) because we go through the linked list once.

4. Space Complexity

The space complexity is O(1) because we only use one pointer and do not need extra memory for another list.

5. Reflection

This solution is efficient because we need to check every node at least once.

Compared to my first approach, I removed the nested loops and made the code simpler by using the fact that the list is already sorted.
