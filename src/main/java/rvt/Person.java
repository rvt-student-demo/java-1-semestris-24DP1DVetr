package rvt;

public class Person{
    private String fullName;
    private String address;

    public Person(String fullName, String address){
        this.fullName = fullName;
        this.address = address;
    }
    public String toString(){
        return String.format("%s\n  %s", fullName, address) ;
    }
}