class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        for(String num:strs){
            char []arr =num.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(num);
        }
        return new ArrayList<>(map.values());
    }
}
