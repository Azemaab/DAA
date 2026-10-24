1. Problem
Given the head of a linked list, return the list after sorting it in ascending order.

2. Approach and Challenges
To solve this problem efficiently in O(n log n) time complexity, I implemented the Merge Sort algorithm, which is well-suited for linked lists because it does not require random access to elements (unlike arrays).

The approach consists of three main steps:
- Divide: Find the middle of the linked list using slow and fast pointers, then split it into two separate sublists.
- Conquer: Recursively sort both sublists.
- Combine: Merge the two sorted sublists into a single sorted linked list using a dummy head pointer.

Challenges and Failed Approaches:
Sorting linked lists using comparison-based sorting algorithms like quicksort or bubble sort can lead to high overhead or poor worst-case performance ($O(n^2)$). Merge sort guarantees O(n log n) time complexity. Careful handling of pointer disconnection (`prev.next = null`) was required to prevent infinite recursion during the split phase.

3. Time and Space Complexity
- Time Complexity: O(n log n), where n is the number of nodes in the linked list. The list is divided in half recursively (log n levels), and merging takes linear time O(n) at each level.
- Space Complexity: O(log n) auxiliary space due to the recursive call stack for the top-down merge sort approach.

4. Reflection and Improvement
- Is there a more efficient approach? The top-down merge sort uses O(log n) stack space. To achieve strictly O(1) constant space, a bottom-up iterative merge sort can be implemented, though top-down is cleaner and easier to maintain.
- What changed from brute force? Instead of converting the linked list to an array, sorting it, and rebuilding it (which uses extra memory and time), we manipulate pointers directly in-place.
