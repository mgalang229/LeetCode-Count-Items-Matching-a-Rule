class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < (int) items.size(); i++) {
            boolean considered = false;
            if (ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))) {
                considered = true;
            }
            if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))) {
                considered = true;
            }
            if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))) {
                considered = true;
            }
            if (considered) {
                count++;
            }
        }
        return count;
    }
}
