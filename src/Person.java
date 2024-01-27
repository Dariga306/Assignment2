abstract class Person implements Comparable<Person>, Payable{ //declares an abstract class named `Person` which implements the `Comparable` interface with itself as the type parameter and also implements the `Payable` interface
    private int id;
    static int idCount = 1; //static variable used to assign unique IDs to each person object
    private String name;
    private String surname;

    public Person(){ //constructor for the `Person` class
        id=idCount++; //initializes the `id` of the person with the current value of `idCount` and then increments `idCount`
    }
    public Person(String name, String surname){
        this();
        this.name=name;
        this.surname=surname;
    } //constructor calls the default constructor `Person()` and sets the name and surname of the person
    public void setName(String person_name){
        this.name=person_name;
    }
    public void setSurname(String person_surname){
        this.surname=person_surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }


    public String getPosition(){
        return "Student";
    }
    @Override
    public String toString(){
        return id + ". " + name+" "+ surname;
    } //'toString()` method to represent a `Person` object as a string

    public int compareTo(Person person1){
        return Double.compare(this.getPaymentAmount(), person1.getPaymentAmount());
    }//`Person` objects are arranged in ascending order of their payment amounts.

}
