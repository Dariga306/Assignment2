import java.util.*; //imports the java.util package

interface Payable{ //declares an interface with one method , which returns a double
    double getPaymentAmount();
}
public class Main { //the beginning of the main class
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();  //This line creates an ArrayList named `list` that holds objects of type `Person`
        list.add(new Employee("John", "Lennon", "Teacher", 27045.78));
        list.add(new Employee("George", "Harrison", "Taxi-driver", 50000.00));
        list.add(new Student("Ringo", "Star", 4.0));
        list.add(new Student("Paul", "McCartney", 2.0));

        Collections.sort(list);// sorts the `list` of Person objects
        printData(list);//calls the `printData()` method, passing the `list` as an argument
    } //objects of type `Employee` and `Student` are created and added to the ArrayList `list`
    public static void printData(Iterable<Person> listed){ //method,that takes an `Iterable` collection of `Person` objects as its parameter
        for(Person person: listed){
            System.out.println(person+" earns "+person.getPaymentAmount()+" tenge");
        }
    }

}
