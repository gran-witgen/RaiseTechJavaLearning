import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> names = new ArrayList<String>();
        String [] students = {"tarou", "hanako", "kantoku", "poti"};
        for (String student:  students){
            names.add(student);
        }
        System.out.println(names);
        // 例外を発生、キャッチする
        try{
            System.out.println(names.get(4));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        // HashMap
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("agasa", 50);
        people.put("sasahara", 45);
        people.put("miura", 62);

        for (String peopleNameKey: people.keySet()){
            System.out.println(peopleNameKey + "の年齢は" + people.get(peopleNameKey) + "歳です");
        }
    }
}