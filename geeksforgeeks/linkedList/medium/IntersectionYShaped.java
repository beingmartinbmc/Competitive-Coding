class GFG
{
    private int getSize(Node a){
        if(a == null) return 0;
        return getSize(a.next) + 1;
    }
	public int intersectPoint(Node a, Node b){
         int c = getSize(a), d = getSize(b);
         if(c == 0 || d == 0) return -1;
         Node biggerList = c > d ? a : b;
         Node smallerList = c <= d ? a : b;
         Node runnerOne = biggerList, runnerTwo = smallerList;
         for(int i=1; i <= Math.abs(c - d); i++) runnerOne = runnerOne.next;
         while(runnerOne != null && runnerTwo != null){
             if(runnerOne.data == runnerTwo.data) return runnerOne.data;
             runnerOne = runnerOne.next;
             runnerTwo = runnerTwo.next;
         }
         return -1;
	}
}
