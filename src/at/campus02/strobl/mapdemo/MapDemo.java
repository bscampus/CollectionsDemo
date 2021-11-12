package at.campus02.strobl.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        gradeOfStudents.put("Mustermann", 1);
        gradeOfStudents.put("Musterfrau", 2);
        System.out.println("gradeOfStudents = " + gradeOfStudents);
        
        gradeOfStudents.put("Mustermann", 3);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        Set<String> students = gradeOfStudents.keySet();
        for (String student : students) {
            Integer grade = gradeOfStudents.get(student);
            System.out.println("Student " + student+ " hat die Note " +grade);

        }

        System.out.println(" ");
        Integer gradeOfMustermann = gradeOfStudents.get("Mustermann");
        System.out.println("gradeOfMustermann = " + gradeOfMustermann);
    }
}
