class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        List<String> val = new ArrayList<>();
            int count = 0;
        for(String word : words) {
            if(word.equals("prev")) {
                count++;
                if(count > val.size()) {
                    ans.add(-1);
                }else {
                    ans.add(Integer.valueOf(val.get(count-1)));
                }
            }else {
                val.add(0, word);
                count = 0;
            }
        }
        return ans;
    }
}