class MapValueComparator implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> me1, Map.Entry<Integer, Integer> me2) {

        return me2.getValue().compareTo(me1.getValue());
    }
}
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int num:nums){
            if(sortedMap.containsKey(num)){
                sortedMap.put(num, sortedMap.get(num) + 1);
            }
            else{
                sortedMap.put(num, 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(
                sortedMap.entrySet());
        Collections.sort(entryList, new MapValueComparator());
        Iterator<Map.Entry<Integer, Integer>> iter = entryList.iterator();
        Map.Entry<Integer, Integer> tmpEntry = null;
        int i = 1;
        while (iter.hasNext()) {
            if(i>k) break;
            tmpEntry = iter.next();
            res.add(tmpEntry.getKey());
            i++;
        }
        return res;
    }
}


