1. Problem
Given an array of integers nums, sort the array in ascending order and return it. You must solve the problem without using any built-in functions in O(n log n) time complexity and with the smallest space complexity possible.
2. Approach and Challenges
To satisfy the strict requirements of O(n log n) time complexity and the smallest possible space complexity (O(1) auxiliary space) without using any built-in functions, I implemented the Heap Sort algorithm.

The approach is divided into two main phases:

 Heap Construction: Transform the input array into a max-heap starting from the last non-leaf node up to the root.
 Extraction: Repeatedly swap the root (the maximum element) with the last element of the current heap, decrease the heap size, and call heapify to restore the max-heap property.

Challenges and Failed Approaches:
Initially, I considered Merge Sort, which also operates in O(n log n) time. However, Merge Sort requires O(n) extra space for temporary arrays during the merging step. To achieve true in-place sorting with O(1) space complexity, Heap Sort was the correct choice. Careful attention was required during index calculations for left and right children to avoid out-of-bounds errors during the heapify process.

Tracing Example (Input: [5, 2, 3, 1]):

 Step 1: Rearrange the array into a max-heap structure.
 Step 2: Swap the root (5) with the last element (1), placing 5 in its final sorted position.
 Step 3: Re-heapify the remaining elements and repeat the swap process until the entire array is sorted in ascending order: [1, 2, 3, 5].

3. Time and Space Complexity

 Time Complexity: O(n log n) because building the heap takes linear time O(n), and each of the n extractions takes O(log n) time.
 Space Complexity: O(1) because the sorting is performed entirely in-place, requiring only a constant amount of extra memory for variable swaps.

4. Reflection and Improvement

 Is there a more efficient approach? O(n log n) is the theoretical lower bound for comparison-based sorting algorithms, making this asymptotically optimal.
 What changed from brute force? We avoided O(n^2) time complexity by utilizing a binary heap structure for efficient maximum-element retrieval.
