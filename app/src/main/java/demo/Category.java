package demo;

import java.util.List;

public class Category {
    private String nameCat;
    private List<Book> books;

    public Category(String nameCat, List<Book> books) {
        this.nameCat = nameCat;
        this.books = books;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

