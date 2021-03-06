# Leetcode

| #    | Title               |  Time           |  Space           | Difficulty           | Notes                  | 
|-------|-------------------- | --------------- | -----------------| ---------------   | --------------------------|
| 0001  |[Two Sum](https://leetcode.com/problems/two-sum/)|O(n)|O(n) |Easy| One-pass Hash Table                    |
| 0441  |[Arranging Coins](https://leetcode.com/problems/arranging-coins/)|O(n)|O(1) |Easy| Binary search       |
| 0121  |[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)|O(n)|O(1) |Easy| While looping, find the min price and the max price after that min price|
| 0724  |[Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)|O(n)|O(n) |Easy| Calculate left sum and right sum for each index. Return the index where left sum = right sum       |
| 0020  |[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)|O(n)|O(n) |Easy| Stack |
| 0253  |[Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)|O(nlogn)|O(n) |Medium| Implement min-heap using PriorityQueue|
| 0013  |[Roman to Integer](https://leetcode.com/problems/roman-to-integer/)|O(1)|O(1) |Easy| Linear scan from left to right |
| 0005  |[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)|O(n^2)|O(n^2) |Medium| |
| 0139  |[Word Break](https://leetcode.com/problems/word-break/)|O(n^2)|O(n) |Medium| |
| 056  |[Merge Intervals](https://leetcode.com/problems/merge-intervals/)|O(nlogn)|O(n) |Medium| |
| 443  |[String Compression](https://leetcode.com/problems/string-compression/)|O(n)|O(1) |Easy| |
| 973  |[K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)|O(n + K)logn|O(n) |Medium| Use TreeMap, distance as key and an arrayList of points|
| 4  |[Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)|O(log(min(x,y)))|O(1) |Hard| x and y are the lengths of two input arrays|
| 5  |[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)|O(n))|O(n) |Medium| Sliding window and hash set|
| 237  |[Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)|O(1))|O(1) |Easy|  Copy next node's data to the current node and adjust the next pointer of the current node|
| 21  |[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)|O(n+m))|O(1) |Easy|  n and m is the number of nodes in the given linked lists|
| 121  |[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)|O(n))|O(1) |Easy| Keep track of min price seen till date and calculate the profit for ith day|
| 23  |[ Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)|O(n log k))|O(n) |Hard| Use min heap|
| 344  |[Reverse String](https://leetcode.com/problems/reverse-string/)|O(n))|O(1) |Easy| 2 pointers in opposite direction|
| 412  |[Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)|O(n))|O(1) |Easy| String concatenation|
| 2  |[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)|O(max(m,n)))|O(max(m,n)) |Medium| |
| 53  |[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)|O(n)|O(1) |Easy| Kadane's algorithm |
| 206  |[Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)|O(n)|O(1) |Easy| Temporarily store next node's pointer, point head to a previous dummy node |
| 560  |[Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)|O(n)|O(n) |Medium| Store frequency map of ebery sum seen till now |
| 49  |[Group Anagrams](https://leetcode.com/problems/group-anagrams/)|O(nklog k)|O(nk) |Medium| n is the length of input array and k is the maximum length of string , sort every string and put it as a key in HashMap and put all matching strings in its corresponding list |
| 349  |[Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)|O(n+m)|O(n+m) |Easy| Hashset|
| 102  |[Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)|O(n)|O(n) |Medium| Queue and ArrayList|
| 103  |[Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)|O(n)|O(n) |Medium| 2 Stacks|
| 62  |[Unique Paths](https://leetcode.com/problems/unique-paths/)|O(nm)|O(nm) |Medium| Dynamic programming|
| 63  |[Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)|O(nm)|O(1) |Medium| Dynamic programming|
| 509  |[Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)|O(n)|O(1) |Easy| Dynamic programming|
| 46  |[Permutations](https://leetcode.com/problems/permutations/)|O(n!)|O(n!) |Medium| Recursion|
| 70  |[Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)|O(n)|O(n) |Easy| Dynamic programming|
| 322  |[Coin Change](https://leetcode.com/problems/coin-change/)|O(ac)|O(a) |Medium| a = amount to make change for, c is number of coins provided, Dynamic programming|
| 146  |[LRU Cache](https://leetcode.com/problems/lru-cache/)|O(1)|O(capacity) |Medium| Hashmap and doubly linked list|
| 88 |[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)|O(n+m)|O(1) |Easy| Two pointers|
| 14 |[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)|O(n)|O(1) |Easy| 1st string is prefix, reduce prefix until indexOf returns 1|
| 101 |[Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)|O(n)|O(h) |Easy| |
| 33 |[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)|O(log n)|O(1) |Medium| Binary search |
| 11 |[Container With Most Water](https://leetcode.com/problems/container-with-most-water/)|O(n)|O(1) |Medium| Two pointers |
| 279 |[Perfect Squares](https://leetcode.com/problems/perfect-squares/)|O(n* squrt n)|O(n) |Medium| Dynamic programming |
| 15 |[3sum](https://leetcode.com/problems/3sum/)|O(n^2)|O(n) |Medium| Two pointers|
| 107 |[Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)|O(n)|O(n) |Medium| Queue, Stack and ArrayList|
| 22 |[Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)|Exponential|O(n) |Medium| Backtracking|
| 54 |[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)|O(n)|O(1) |Medium| Just iterate|
| 953 |[Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/)|O(n)|O(1) |Medium| Implement custom compare method|
| 127 |[Word Ladder](https://leetcode.com/problems/word-ladder/)|O(n^2)|O(n) |Medium| BFS using queue|
| 17 |[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)|O(3 ^ N * 4 ^ M))|O(3 ^ N * 4 ^ M) |Medium| Cartesian product using LinkedList|
| 138 |[Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)|O(n)|O(n)|Medium| 2 pass technique with hash map|
| 380 |[Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/)|O(1)|O(n)|Medium| ArrayList and HashMap|
| 347 |[Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)| O(Nlogk)|O(n)|Medium| Map and PriorityQueue|
| 200 |[Number of Islands](https://leetcode.com/problems/number-of-islands/)| O(mn)|O(mn)|Medium| Depth first search in recursive fashion|
| 207 |[Course Schedule](https://leetcode.com/problems/course-schedule/)| O(E + V)|O(E + V)|Medium| Topological sort using Depth first search|
| 210 |[Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)| O(E + V)|O(E + V)|Medium| Topological sort using Depth first search|
| 662 |[Maximum Width of Binary Tree](https://leetcode.com/problems/maximum-width-of-binary-tree/)| O(n)|O(n)|Medium| Level Order Traversal|
