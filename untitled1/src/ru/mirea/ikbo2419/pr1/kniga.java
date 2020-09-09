package ru.mirea.ikbo2419.pr1;

public class kniga {
    private String Author;
    private int year;
    private int page;
    public kniga(String Author, int year, int page){
        this.Author=Author;
        this.year=year;
        this.page=page;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String toString(){
        return this.Author+" wrote his first book in "+this.year+" and u stopped on "+this.page+" page.";
    }
}
