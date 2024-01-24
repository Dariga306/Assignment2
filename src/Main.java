import java.util.*;

interface Payable{
    double getPaymentAmount();
}
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Employee("John", "Lennon", "Teacher", 27045.78));
        list.add(new Employee("George", "Harrison", "Taxi-driver", 50000.00));
        list.add(new Student("Ringo", "Star", 4.0));
        list.add(new Student("Paul", "McCartney", 2.0));

        Collections.sort(list);
        printData(list);
    }
    public static void printData(Iterable<Person> listed){
        for(Person person: listed){
            System.out.println(person+" earns "+person.getPaymentAmount()+" tenge");
        }
    }

}
