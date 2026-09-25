Binary Search Assignment Report
1. Problem
For this lab, we need to find a target number in a sorted array and return its index, or return -1 if it is not found.
2. Approach
Instead of using a basic linear search like we did initially, I used binary search since the array is already sorted. I set left to 0 and right to the end of the array. Inside a while loop, I check the midpoint. If it matches the target, I return the index. If the target is larger, left moves up to mid + 1. If it is smaller, right moves down to mid - 1.
3. Time Complexity
Time Complexity: O(log n)
Explanation: Because we cut the search space in half with every iteration instead of checking elements one by one, the operations grow logarithmically.
4. Space Complexity
Space Complexity: O(1)
Explanation: The code only uses a few integer variables like left, right, and mid, so the extra memory stays constant.
5. Reflection
Is there a more efficient approach? Yes, binary search is already the optimal solution we learned about.
What did we change from brute-force? We stopped checking every single element sequentially and started skipping half the data each time.
What complexity did we achieve? We successfully lowered the time complexity from O(n) down to O(log n).
