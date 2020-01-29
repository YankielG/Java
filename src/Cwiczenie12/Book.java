package Cwiczenie12;

import java.util.Objects;

public class Book {
     String title;
     String author;
     String publisher;
     int yer;

    public Book(String title, String author, String publisher, int yer) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yer = yer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yer == book.yer &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, yer);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yer=" + yer +
                '}';
    }
}





