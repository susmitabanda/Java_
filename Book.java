import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        while (true) {
            String option = JOptionPane.showInputDialog(null, "Choose an option:\n1. Add Book\n2. Remove Book\n3. View Books\n4. Exit", "Book Manager", JOptionPane.QUESTION_MESSAGE);

            if (option == null || option.equals("4")) {
                JOptionPane.showMessageDialog(null, "Exiting the Book Manager. Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            switch (option) {
                case "1":
                    Book book = new Book();
                    book.setTitle(JOptionPane.showInputDialog(null, "Enter Book Title:", "Add Book", JOptionPane.QUESTION_MESSAGE));
                    book.setAuthor(JOptionPane.showInputDialog(null, "Enter Book Author:", "Add Book", JOptionPane.QUESTION_MESSAGE));
                    book.setIsbn(JOptionPane.showInputDialog(null, "Enter Book ISBN:", "Add Book", JOptionPane.QUESTION_MESSAGE));
                    bookList.add(book);
                    JOptionPane.showMessageDialog(null, "Book added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    String isbnToRemove = JOptionPane.showInputDialog(null, "Enter ISBN of the book to remove:", "Remove Book", JOptionPane.QUESTION_MESSAGE);
                    boolean removed = bookList.removeIf(b -> b.getIsbn().equals(isbnToRemove));
                    if (removed) {
                        JOptionPane.showMessageDialog(null, "Book removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "3":
                    StringBuilder books = new StringBuilder("Books in the Library:\n");
                    for (Book b : bookList) {
                        books.append("Title: ").append(b.getTitle())
                             .append(", Author: ").append(b.getAuthor())
                             .append(", ISBN: ").append(b.getIsbn()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, books.length() > 0 ? books.toString() : "No books available.", "View Books", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option! Please choose again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
