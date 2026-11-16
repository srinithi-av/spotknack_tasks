import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        students.add("Danish");
        students.add("Jayanth");
        students.add("Danish");
        students.add("Madhan");
        students.add("Nancy");

        System.out.println("HashSet: " + students);

        LinkedHashSet<String> students1 = new LinkedHashSet<>();

        students1.add("Danish");
        students1.add("Jayanth");
        students1.add("Madhan");
        students1.add("Nancy");

        System.out.println("LinkedHashSet: " + students1);
    }
}