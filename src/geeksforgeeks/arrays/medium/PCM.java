package geeksforgeeks.arrays.medium;

import java.util.*;
import java.io.*;

class Student{
    private int physics;
    private int chemistry;
    private int maths;

    Student(int p, int c, int m){
        physics = p;
        chemistry = c;
        maths = m;
    }

    public int getPhysics(){
        return physics;
    }
    public int getChemistry(){
        return chemistry;
    }
    public int getMaths(){
        return maths;
    }

    @Override
    public String toString(){
        return getPhysics()+" "+getChemistry()+" "+getMaths();
    }
}

class PCM{
    private static void sort(List<Student> list){
        list.sort(Comparator.comparing(Student::getPhysics).thenComparing(Student::getChemistry, Comparator.reverseOrder()).thenComparing(Student::getMaths));
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            List<Student> list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine().trim());
            for(int i=1; i<=n; i++){
                String[] inputs = br.readLine().trim().split(" ");
                int p = Integer.parseInt(inputs[0]);
                int c = Integer.parseInt(inputs[1]);
                int m = Integer.parseInt(inputs[2]);
                list.add(new Student(p, c, m));
            }
            sort(list);
            list.forEach(e->System.out.println(e));
            t -= 1;
        }
    }
}
