import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("tarou");
        People people2 = new People("hanako");
        People people3 = new People("sakura");

        // stream not use
        List<People> peopleGroup1 = new ArrayList<People>(Arrays.asList(people1, people2, people3));
        for (People e : peopleGroup1) {
            System.out.println("名前は" + e.getName() + "です");
        }

        // stream use
        List<People> peopleGroup2 = new ArrayList<People>(Arrays.asList(people1, people2, people3));
        peopleGroup2.stream().forEach(p -> {
            System.out.println("名前は" + p.getName() + "です");
        });
    }
}