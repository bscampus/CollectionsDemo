package at.campus02.strobl.setdemo;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Max Mustermann");
        students.add("Susi Sorglos");
        String maxi = "Maxi Testfall";
        students.add(maxi);

        System.out.println(students);

        students.remove(maxi);
        System.out.println("students = " +students);

        boolean isMaxiInSet = students.contains(maxi);
        boolean isMaxInSet = students.contains("Max Mustermann");
        System.out.println("Is Maxi in Set = " +isMaxiInSet);
        System.out.println("Is Max in Set = " +isMaxInSet);

        students.add(maxi);

        for (String student : students) {
            System.out.println("Student = " +student);
        }


    }
}
