
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Arrays;

/**
 *
 * @author homepc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students = {
            new Student("name3", 10, true, new int [] {1,2,3}),
            new Student("name2", 20, true, new int [] {1,2,3}),
            new Student("name2", 30, false, new int [] {4,4,3}),
            new Student("name3", 30, true, new int [] {1,2,3}),
        };
        Stream<Student> studentsStream = Arrays.stream(students);
        //задание 1
        double avgAge = studentsStream.parallel().filter((student) ->
                !student.getDismissed()
        ).mapToInt((student) -> student.getAge()).average().getAsDouble();
        System.out.println(avgAge);
        //задание 2
        var test = Arrays.stream(students)
                .parallel()
                .filter(x -> x.getDismissed())
                .collect(Collectors.groupingBy(
                        student -> student.getName(),
                        Collectors.counting()
                ));
        var result = test.entrySet().parallelStream()
                .max(Comparator.comparing(obj -> obj.getValue()))
                .get().getKey();
        System.out.println(result);
        //задание 3
        var ttt = Arrays.stream(students)
                .parallel()
                .filter(stud -> stud.getAge() > 20 && 
                        Arrays.stream(stud.getMarks()).
                                anyMatch(mark -> mark == 1 || mark == 2)
                ).count();
        System.out.println(ttt);
    }
}
