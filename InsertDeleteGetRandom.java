/*
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.

*/

/*
HashSet and HashMap: we can implement insert and remove in O(1) time but cannot implement getRandom() since no concept of index.
ArrayList: we can implement insert and getRandom in O(1) time but cannot implement remove().
Use combination of both
*/
class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size() -1);
            return true;
        }
        return false; 
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);
    
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);
        
        map.remove(val);
        list.remove(list.size() - 1);
        return true; 
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
 
 /*
 Time complexity: O(1)
 Space complexity: O(n)
 */
