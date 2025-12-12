package rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String fullName, String address, int salary){
        super(fullName, address);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%s\n  salary %d euro/month", super.toString(), salary);
    } 
}
