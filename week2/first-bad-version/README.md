First Bad Version Assignment Report
1. Problem
Find the first bad version using the isBadVersion API with minimal calls.
2. Approach
Instead of a slow linear check, I used binary search. Setting left = 1 and right = n, I check the midpoint mid in a loop. If isBadVersion(mid) is true, right becomes mid. If false, left becomes mid + 1.
3. Time Complexity
Time Complexity: O(log n)
Explanation: Cutting the range in half every check makes operations grow logarithmically.
4. Space Complexity
Space Complexity: O(1)
Explanation: Only a few variables are used, so extra memory stays constant.
5. Reflection
Is there a more efficient approach? No, binary search is optimal.
What did we change from brute-force? We replaced a sequential loop with binary search.
What complexity did we achieve? Reduced time complexity from O(n) to O(log n).
