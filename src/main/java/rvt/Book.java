package rvt;

public class Book {
    private String title;
    private int paper;
    private int year;

    public Book(String title, int paper, int year){
        this.title = title;
        this.paper = paper;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public String getPages(){
        return paper + " pages";
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return this.title + ", "  + this.paper  + " pages, " + this.year;
    }
}
