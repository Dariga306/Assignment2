class Student extends Person{
    final static double scholarship=36660.00;
    private double gpa;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa=gpa;
    }
    public void setGpa(double gpa1){
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public String toString(){
        return "Student: "+super.toString();
    }
    public double getPaymentAmount(){
        if(gpa>2.67){
            return scholarship;
        }
        else{
            return 0.00;
        }
    }



}
