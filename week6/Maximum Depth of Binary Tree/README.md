Maximum Depth of Binary Tree
1. Problem
The task is to find the maximum depth of a binary tree. Maximum depth means the number of nodes on the longest path from the root node to the farthest leaf.
2. Approach
I solved this problem using recursion. First, I check if the node is null. If it is null, I return 0. Otherwise, I calculate the depth of the left and right subtrees. I use Math.max() to choose the larger depth and add 1 for the current node.
Step-by-step:
1. Node 9 has no children, so its depth is 1.
2. Nodes 15 and 7 also have no children, so each has depth 1.
3. Node 20 has two children, so its depth is 1 + max(1,1) = 2.
4. Node 3 has left depth 1 and right depth 2, so its depth is 1 + max(1,2) = 3.
Output: 3
Challenges and Testing
The main challenge was understanding how recursion returns the depth from the children to the parent node. I needed to understand why we use Math.max() instead of adding both subtree depths.
I tested the solution with an empty tree, a tree with only one node, and a tree with several levels. These tests helped me check whether the base case and maximum depth calculation work correctly.
3. Time Complexity
Time Complexity: O(n)
Every node is visited exactly once to calculate its depth. If the tree contains n nodes, the algorithm processes each node once.
Space Complexity: O(h)
The recursive call stack depends on the height of the tree. In the worst case, the tree can be completely unbalanced, and the height can be n, so the space complexity can be O(n).
4. Reflection / Improvement
The recursive solution is already efficient because every node must be checked to find the maximum depth.
Another approach is Breadth-First Search (BFS), using a queue to process the tree level by level. It can also achieve O(n) time complexity. I chose recursion because the code is shorter and easier to understand for this problem.
