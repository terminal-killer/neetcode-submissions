class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length()!=t.length()){
        return false;
      }
 
     HashMap<Character,Integer> countS=new HashMap<>();
     HashMap<Character,Integer> countT=new HashMap<>();

     for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);


        if (countS.containsKey(a)) {
                countS.put(a, countS.get(a) + 1);
            } else {
                countS.put(a, 1);
            }

            // Count characters in t
            if (countT.containsKey(b)) {
                countT.put(b, countT.get(b) + 1);
            } else {
                countT.put(b, 1);
            }
        }

        return countS.equals(countT);
    }
}
