package at.campus02.strobl.listdemo;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Heinz");
        students.add("Marx");
        students.add("Sturm");
        students.add("Groß");
        students.add("Müller");
        students.add("Mayer");
        students.add("Sturm");

        printStudents(students);

        students.remove(5);
        students.remove(1);

        printStudents(students);

        boolean isExistent = students.contains("Sturm");
        System.out.println("isExistent = " + isExistent);

        isInList(students,"Sturm");


    }

    public static boolean isInList(ArrayList<String> studentList, String student) {
        for (String studentinList : studentList) {
            if (studentinList.equals(student)){
                System.out.println(" ");
                System.out.println("Ja, ist bereits enthalten");
                return true;
            }
        }
        return false;
    }

    public static void printStudents(ArrayList<String> studentList) {
        for (String s : studentList) {
            System.out.println("s = " + s);
        }
        System.out.println(" ");
    }
}

