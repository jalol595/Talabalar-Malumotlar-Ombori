package com.company;

import java.util.LinkedList;
import java.util.List;

public class Data {

    private String name;

    private List<Students> studentsList;

    public Data() {
        studentsList = new LinkedList<>();
    }

    public void getName() {
        System.out.println("Talabalar malumotlar ombori");
    }

    public void add(String firstName, String lastName, String number) {
        studentsList.add(new Students(firstName, lastName, number));

    }


    public String first() {

        Students students = studentsList.get(0);

        return students.toString();
    }

    public String get(int n) {
        if (n > 0) {

            return studentsList.get(n - 1).toString();

        }

        return null;

    }


    public void tostring() {
        for (Students students : studentsList) {
            System.out.print("(" + students.toString() + ")");
        }
    }

    public String find(String text) {

        for (Students students : studentsList){
            if (students.malibu(text)){
                return students.toString();
            }
        }

        return null;
    }

}
