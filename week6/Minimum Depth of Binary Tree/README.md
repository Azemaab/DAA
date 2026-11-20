Minimum Depth of Binary Tree
1. Problem
The task is to find the minimum depth of a binary tree. Minimum depth means the number of nodes along the shortest path from the root node to the nearest leaf node. A leaf is a node that has no children.
2. Approach
I solved this problem using recursion. First, I check if the root is null. If it is null, I return 0.
Then I check if the node has children. If the left child is missing, I continue searching through the right child. If the right child is missing, I continue through the left child.
If both children exist, I calculate the depths of both subtrees and choose the smaller depth using Math.min(). Finally, I add 1 for the current node.
Step-by-step:
1. Nodes 9, 15, and 7 are leaf nodes, so their depth is 1.
2. Node 20 has two children, so its minimum depth is 1 + min(1,1) = 2.
3. Node 3 has a left child 9 and a right subtree with depth 2.
4. The shortest path is from 3 to 9, so the minimum depth is 2.
Output: 2
Challenges and Testing
The main challenge was understanding how to handle nodes that have only one child. If I use Math.min() directly when one child is null, the algorithm may incorrectly choose the empty child and return a wrong depth.
I tested the solution with an empty tree, a single-node tree, a tree with two children, and a tree that has only one child at each level. These cases helped me understand why both missing-child conditions are necessary.
3. Time Complexity
Time Complexity: O(n)
In the worst case, the algorithm visits every node in the tree to find the nearest leaf. Each node is processed at most once.
Space Complexity: O(h)
The space is used by the recursive call stack and depends on the height of the tree. In the worst case, the tree can be unbalanced, so h can equal n.
4. Reflection / Improvement
Another approach is Breadth-First Search (BFS), using a queue to visit nodes level by level. When we find the first leaf, we can immediately return its depth because BFS visits the closest nodes first.
This approach can be more efficient in practice because it may not need to visit the entire tree. However, its worst-case time complexity is still O(n).
