/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> outputArr = new ArrayList<>();
        int[] currentInterval = intervals[0];
        outputArr.add(currentInterval);
        
        for(int[] interval : intervals) {
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            
            if(currentEnd >= nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                outputArr.add(currentInterval);
            } 
        }
        return outputArr.toArray(new int[outputArr.size()][]);
        
    }
}
