package rvt;

public class Student extends Person{
    private int credits = 0;
    
    public Student(String fullName, String address){
        super(fullName, address);
    }
    public int credits(){
        return credits;
    }
    public void study(){
        credits ++;
    }

    @Override
    public String toString(){
        return String.format("%s\n  Study credits %d", super.toString(), credits());
    } 
}