package strings.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;

    public Student(int physicsMarks, int chemistryMarks, int mathsMarks) {
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }
}

public class MarksOfPCM {
    private static void solve(Student[] students){
        Arrays.sort(students, Comparator.comparing(Student::getPhysicsMarks)
                .thenComparing(Student::getChemistryMarks, Comparator.reverseOrder())
                .thenComparing(Student::getMathsMarks));
        Arrays.stream(students).forEach(e->System.out.println(e.getPhysicsMarks() +" "+e.getChemistryMarks() +" " +e.getMathsMarks()));
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            int index = 0;
            Student[] students = new Student[n];
            for(int i=1; i<=n; i++){
                String[] inputs = br.readLine().trim().split(" ");
                students[index++] = new Student(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
            }
            solve(students);
            t -= 1;
        }
    }
}
