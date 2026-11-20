Merge Two Binary Trees
1. Problem
The task is to merge two binary trees. If two nodes overlap, I add their values. If a node exists in only one tree, I keep it unchanged.
2. Approach
I use recursion to compare both trees. If one node is null, I return the other node. If both nodes exist, I add their values and recursively merge their left and right children.
Tracing
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
- Root: 1 + 2 = 3
- Left: 3 + 1 = 4
- Right: 2 + 3 = 5
- The existing nodes 5, 4, and 7 are kept where the other tree has null.
Output: [3,4,5,5,4,null,7]
The main challenge was handling null nodes correctly and understanding how recursion merges both trees at the same positions.
3. Time Complexity
Time Complexity: O(n + m)
Each tree's nodes are visited at most once.
Space Complexity: O(h)
Recursive calls use the call stack, depending on the height of the tree. In the worst case, it can be O(n + m).
4. Reflection / Improvement
An iterative solution using a queue or stack could replace recursion. Time complexity would remain O(n + m), but it would avoid recursive calls.
