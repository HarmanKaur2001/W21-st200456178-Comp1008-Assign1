import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
*purpose:to test the student class
* name:Harman Kaur
* time:12:00pm
* date: 2021
 */

public class StudentInterests {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);//here the scanner is used

        //arraylist of unchartedInterests are created
        ArrayList<String> unchartedInterests = new ArrayList<>();
        unchartedInterests.addAll(Arrays.asList("riding","movies","travelling"));
        Student interestsOfStudent = new Student("Harman","Kaur",67868,unchartedInterests);
        Student otherInterests =  new Student("Sukhman","kaur",767868,unchartedInterests);

        //now the first name, last name, student id and interests are printed
        System.out.println("First Name:" + interestsOfStudent.getFirstName());
        System.out.println("last Name:"  + interestsOfStudent.getLastName());
        System.out.println("Student ID:" + interestsOfStudent.getStudentId());
        System.out.println("Interests:"  + interestsOfStudent.getInterests());

        //otherStudent.setInterests("riding");//valid input
        //otherStudent.setInterests("Dancing");//invalid input


        System.out.printf("%s is a %s hobby with the value of %d  %n" ,interestsOfStudent,interestsOfStudent.getTheme()
                ,interestsOfStudent.getFirstIndex(),interestsOfStudent.getLastName());

        System.out.printf("%s is a %s hobby with the value of %d %n" ,otherInterests,otherInterests.getTheme()
        ,otherInterests.getFirstIndex());
    }
}
