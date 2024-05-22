package school_library_task5_library_service;

import school_library_task5.JnrStudent;
import school_library_task5.SnrStudent;
import school_library_task5.Teacher;

import java.util.ArrayList;

public class Librarian{

    ArrayList<Books> books;

    public Librarian(){
        books = new ArrayList<>();
    }

    public void updateBookInventory(Books book){

        books.add(book);
        //System.out.println("hello world");

    }

    public ArrayList<Books> getBooks(){
        return books;
    }

}
