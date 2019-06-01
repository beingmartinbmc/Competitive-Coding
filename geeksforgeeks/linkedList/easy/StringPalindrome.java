class GfG{
    private boolean isPalindrome(String s){
        for(int i=0, j=s.length()-1; i < s.length() && j >= 0; i++, j--)
            if(s.charAt(i) != s.charAt(j)) return false;
        return true;
    }
    public boolean compute(Node head){
        StringBuilder b = new StringBuilder();
        Node runner = head;
        while(runner != null){
            b.append(runner.data);
            runner = runner.next;
        }
        return isPalindrome(b.toString());
    }
}
