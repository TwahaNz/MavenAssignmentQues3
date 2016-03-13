package com.tnz.app.test;

import com.tnz.app.domain.Contacts;
import com.tnz.app.domain.Numbers;
import com.tnz.app.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] names = {"A","B","C","D","E","F","G","F","I","J"};

        List<Student> students = new ArrayList<Student>();
        Contacts contacts = new Contacts();
        Numbers studNums = new Numbers();

        int count = 0;
        long contactNum = 1000000000;

        for (String s : names){

            students.add(new Student(count, names[count], new Random().nextInt((int)contactNum)));
            studNums.addItems(students.get(count));
            contacts.addItems(students.get(count).getStudNum(), students.get(count));
            count++;

        }

        out.println("All Student Details \n ================== \n\n ");

        for (Student s : students)
            out.println(s.toString());

        out.println("All Student Contacts \n ================== \n\n ");

        for (int i = 0; i < contacts.getMap().size(); i++){
            out.println(contacts.getMap().get(i).getStudCon());
        }

        out.println("All Student Number \n ================== \n\n ");

        out.println(studNums.getSet().toArray().length);

    }
}
