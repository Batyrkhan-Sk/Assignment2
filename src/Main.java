import java.util.ArrayList;
import java.util.Collections;
import models.Student;
import models.Person;
import models.Employee;


public class Main {
    public static void main(String[] args){
        ArrayList<Person> people  = new ArrayList<>();

        people.add(new Student("Paul", " McCartney", 36660.00));
        people.add(new Student("Ringo", " Starr", 0.00));
        people.add(new Employee("John", " Lennon","Junior QA-Engineer ", 27045.78));
        people.add(new Employee("George", " Harrison", "Middle QA-Engineer ", 50000.00));

        Collections.sort(people);
        printData(people);

    }
    public static void printData(Iterable<Person> people){
        for (Person person : people){
            System.out.println(person.getPosition()+": "+ person +" earns " +person.getPaymentAmount()+" tenge" );
        }
    }
}

