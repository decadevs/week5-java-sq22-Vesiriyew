package school_library_task5_library_service;

import java.util.ArrayList;

public class Librarian{

    ArrayList<Books> books;

    public Librarian(){
        books = new ArrayList<>();
    }

    public void updateBookInventory(Books book){

        books.add(book);

    }

    public ArrayList<Books> getBooks(){
        return books;
    }

}
