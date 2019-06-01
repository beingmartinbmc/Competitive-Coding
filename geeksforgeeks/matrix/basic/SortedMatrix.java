package matrix.basic;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(t > 0){
            int n = input.nextInt();
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    list.add(input.nextInt());
            list.sort(Comparator.naturalOrder());
            for(int i : list)
                System.out.print(i +" ");
            System.out.println();
            list.clear();
            t -= 1;
        }
    }
}
