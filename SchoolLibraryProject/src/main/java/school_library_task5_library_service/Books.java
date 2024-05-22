package school_library_task5_library_service;

public class Books {
    private String title;
    private String author;
    private int noOfBooksPerTitle;

    public Books(String title, String author, int noOfBooksPerTitle) {
        this.title = title;
        this.author = author;
        this.noOfBooksPerTitle = noOfBooksPerTitle;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", noOfBooksPerTitle=" + noOfBooksPerTitle +
                '}';
    }

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

    public int getNoOfBooksPerTitle() {
        return noOfBooksPerTitle;
    }

    public void setNoOfBooksPerTitle(int noOfBooksPerTitle) {
        this.noOfBooksPerTitle = noOfBooksPerTitle;
    }
}



