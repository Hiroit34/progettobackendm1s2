package Elemento;

public abstract class Elemento {

    private String isbn;
    private String title;
    private int yearOfPublication;
    private int numberOfPages;

    public Elemento(String isbn, String title, int yearOfPublication, int numberOfPages){
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
