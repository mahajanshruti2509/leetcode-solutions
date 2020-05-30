/*
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
*/

class Point {
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if(points == null || points.length == 0) {
            return new int[0][0];
        }
        
        if(points.length == 1 && K == 1) {
            return points;
        }
        
        Map<Double, List<Point>> distanceMap = new TreeMap<>();
        int[][] output = new int[K][2];
        
        for(int[] point : points) {
            double distance = Math.sqrt(point[0]*point[0] + point[1]*point[1]);
            List<Point> values = distanceMap.get(distance);
            if(values == null) {
                values = new ArrayList<Point>();
            }
            values.add(new Point(point[0], point[1]));
            distanceMap.put(distance, values);
        }
        
        for(Map.Entry<Double, List<Point>> entry : distanceMap.entrySet()) {
            for(Point values : entry.getValue()) {
                if(K <= 0) {
                    break;
                }
                output[K-1][0] = values.x;
                output[K-1][1] = values.y;
                K--;
            }
        }
        return output;
    }
}
