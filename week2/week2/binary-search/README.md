Binary solution 
1. Problem
We need to find the first bad version in our product. Because all versions after a bad one are broken, we use the isBadVersion API to find the exact broken one while making less calls.
2. Approach
Instead of checking every version one by one which takes too long, I used binary search. I set left to 1 and right to n, then found the midpoint mid inside a while loop. If isBadVersion(mid) is true, the bad version is to the left, so right becomes mid. If false, it is to the right, so left becomes mid plus one. When the loop ends, both meet at the first bad version.
3. Time Complexity
Time Complexity: O(log n)
Explanation: Rather than checking every version like a linear scan, binary search cuts the range in half with every check, so operations grow logarithmically.
4. Space Complexity
Space Complexity: O(1)
Explanation: The code only uses a few variables like left, right, and mid, so extra memory stays constant.
5. Reflection
Is there a more efficient approach? Yes, binary search is already the best solution.
What did we change from a brute-force method? We stopped using a simple loop that checks everything sequentially and treated versions as a sorted range instead.
What complexity did we achieve? We successfully lowered the time complexity from O(n) down to O(log n).
