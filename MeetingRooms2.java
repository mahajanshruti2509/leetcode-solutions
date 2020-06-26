
/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1
*/
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0 || intervals == null) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a, b) -> a - b);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // O(n logn )
        minHeap.add(intervals[0][1]); // add 1st meeting's end time to the heap
        
        for(int i = 1; i < intervals.length; i++) {
            int earliestEndTime = minHeap.peek(); // O(1)
            int currentStartTime = intervals[i][0];
            int currentEndTime = intervals[i][1];
            if( currentStartTime >= earliestEndTime) {
                minHeap.poll(); // O(log n)
            }
            minHeap.add(currentEndTime); // O(log n)
        }
        return minHeap.size();
    }
}
