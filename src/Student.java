import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
/*purpose of the class: to add first name, last name, student id and interests
*name: harman kaur
* date:2021-02-09
* time:10:30 am
 */
public class Student {
    /**
     * test commitlknklml
     */
    private String firstName;//firstname is taken as string
    private String lastName;//last name is taken as string
    private int studentId;//studentId is taken as integer
    private ArrayList<String> interests;//interests are taken as array list type string

    public Student(String firstName, String lastName, int studentId, ArrayList<String> interests)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentId(studentId);
        setInterests(interests);
    }


//here the getter and setter method is put for first name, last name, student id and interests
    public String getFirstName() {
        return firstName;
    }

    //first names are put under array list type string
    public static List<String> getFirstNames() {
        return Arrays.asList("Harman", "Sukhman", "Agam", "Gurnoor", "Simran", "Harpal", "Rupinder");
    }

    public void setFirstName(String firstName) {
       //firstName = firstName.toLowerCase();//this is case sensitive case
        List<String> firstNames = getFirstNames();
        //here the validation of the first name
        if (firstNames.contains(firstName))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException(firstName + "is not valid. chose from these"+ firstNames);
    }

    public void setLastName(String lastName){
       lastName = lastName.toLowerCase();
        //here the last name is to be validated
        if (lastName.contains(lastName))
            this.lastName= lastName;

        else
            throw new IllegalArgumentException(lastName + "has no rule to use upper case" + lastName);
    }

    public void setStudentId(int studentId){
       //student id is to be validated
        if (studentId>=10000)
            this.studentId = studentId;
        else
            throw new InputMismatchException(studentId +"has no chars"+ studentId);
    }

    //getter for the last name
    public String getLastName() {
        return lastName;
    }

    //getter for the student id
    public int getStudentId() {
        return studentId;
    }

    //getter for the interests
    public ArrayList<String> getInterests() {
        return interests;
    }

    //interests are write under array list
    public void setInterests(ArrayList<String> interests) {
        List<String> validInterests = Arrays.asList("riding","movies","travelling","skiing","dancing","gaming","reading");
        for (int i =0;i<interests.size();i++) {
            if (validInterests.contains(interests.get(i)))//case sensitive comparison
                this.interests = interests;
            else
                throw new IllegalArgumentException(interests + " " + "is not valid. use one of them" + validInterests);
        }
    }

    //here the theme for the interests are used where we get to know that interests are horrific or interesting
    public String getTheme()
    {
        if(interests.equals("riding")|| interests.equals("skiing"))
            return " horrific";
        else
            return "interesting";
    }

    //the index for the first name is get here
    public int getFirstIndex()
    {
        //index of each interests
        return getFirstNames().indexOf(firstName) + 2;
    }

    //string method is used for the return the interests of the first name and of is used as concatenated
    public String toString()
    {
        return interests +" " +"of" +" "+ firstName;
    }
}

