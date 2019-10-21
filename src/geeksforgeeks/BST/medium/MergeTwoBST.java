package geeksforgeeks.BST.medium;

class GfG
{
    private static void inorder(Node root, List<Integer> list){
        if(root != null){
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
	public static void merge(Node root1 , Node root2){
	    List<Integer> listOne = new ArrayList<>();
	    List<Integer> listTwo = new ArrayList<>();
	    inorder(root1, listOne);
	    inorder(root2, listTwo);
	    int n = listOne.size();
	    int m = listTwo.size();
	    int[] a = new int[n + m];
	    int i = 0, j = 0, k = 0;
	    while(i < n && j < m){
	        if(listOne.get(i) < listTwo.get(j))
	            a[k] = listOne.get(i++);
	        else
	            a[k] = listTwo.get(j++);
	        k += 1;
	    }
	    while(i < n) a[k++] = listOne.get(i++);
	    while(j < m) a[k++] = listTwo.get(j++);
	    Arrays.stream(a).forEach(e->System.out.print(e+" "));
    }
}
