/* Problem: https://leetcode.com/problems/design-a-number-container-system/ */


class NumberContainers {
    private Map<Integer, TreeSet<Integer>> numIndMap = new HashMap<Integer, TreeSet<Integer>>();
    private Map<Integer, Integer> indNumMap = new HashMap<Integer, Integer>();

    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        if (indNumMap.containsKey(index)) {
            int num = indNumMap.get(index);
            TreeSet<Integer> indexSet = numIndMap.get(num);
            indexSet.remove(index);
            if (indexSet.size() == 0) {
                numIndMap.remove(num);
            } else {
                numIndMap.put(num, indexSet);
            }
        }
        TreeSet<Integer> newIndexSet = numIndMap.getOrDefault(number, new TreeSet<>());
        newIndexSet.add(index);
        numIndMap.put(number, newIndexSet);
        indNumMap.put(index, number);
    }
    
    public int find(int number) {
        if (numIndMap.containsKey(number)) {
            return numIndMap.get(number).first();
        }
        return -1;
    }
}
