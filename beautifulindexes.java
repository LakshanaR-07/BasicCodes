class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                aList.add(i);
            }
        }
        for (int i = 0; i <= s.length() - b.length(); i++) {
            if (s.substring(i, i + b.length()).equals(b)) {
                bList.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i : aList) {
            for (int j : bList) {
                if (Math.abs(i - j) <= k) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}