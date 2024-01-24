abstract class Person implements Comparable<Person>, Payable{
    private int id;
    static int idCount = 1;
    private String name;
    private String surname;

    public Person(){
        id=idCount++;
    }
    public Person(String name, String surname){
        this();
        this.name=name;
        this.surname=surname;
    }
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
    }

    public int compareTo(Person person1){
        return Double.compare(this.getPaymentAmount(), person1.getPaymentAmount());
    }


}
