package geeksforgeeks.strings.medium;

class GfG{
    private boolean isInterleaved(String a, String b, String c, Map<String, Boolean> map){
        if(a.length() + b.length() != c.length()) return false;
        if(a.isEmpty() && b.isEmpty() && c.isEmpty()) return true;
        String key = a + "->" + b + "->" + c;
        if(map.containsKey(key)) return map.get(key);
        else{
            boolean resultOne = !a.isEmpty() && a.charAt(0) == c.charAt(0) && isInterleaved(a.substring(1), b, c.substring(1), map);
            boolean resultTwo = !b.isEmpty() && b.charAt(0) == c.charAt(0) && isInterleaved(a, b.substring(1), c.substring(1), map);
            map.put(key, resultOne || resultTwo);
        }
        return map.get(key);
    }
	public boolean isInterLeave(String a,String b,String c){
	    return isInterleaved(a, b, c, new HashMap<>());
	}
}
