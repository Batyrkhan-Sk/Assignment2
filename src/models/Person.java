package models;
import interfaces.Payable;

public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        this.id = idCounter++;
    }
    public Person(String name,String surname){
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public double getPaymentAmount(){
        return 0.0;
    }
    public String getPosition() {
        return "Student";
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    public String toString(){
        return id + "." + name + surname;
    }


}
