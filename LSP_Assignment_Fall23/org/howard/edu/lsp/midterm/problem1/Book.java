package org.howard.edu.lsp.midterm.problem1;

class Book 
{
    private String name, author;
    private int yearOfPublication;
    
    // constructor
    public Book(String name, String author, int yearOfPublication)
    {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    
 
    public String seperator = " ";
    
    public String toString(){
        return name + seperator + author + seperator + yearOfPublication;
    }
}

    // Override the toString() method to display the book’s title, author, and year
    public String toString(){
        return super.toString() + super.seperator + publisher + super.seperator ;
    }
}
