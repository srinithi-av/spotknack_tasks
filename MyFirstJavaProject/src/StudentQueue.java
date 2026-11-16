import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue {
    public static void main(String[] args) {

        Queue<String> student = new LinkedList<>();

        student.add("Danish");
        student.add("Jayanth");
        student.add("Madhan");
        student.add("Nancy");

        System.out.println("Student Queue: " + student);
        System.out.println("Student 1: " + student.peek());
        System.out.println("\nProcessing Next Student: " + student);

        while (!student.isEmpty()) {
            System.out.println("Processed Student List: " + student.poll());
        }

        System.out.println("Queue: " + student);

    }
}