package school_library_task5;

import school_library_task5.enums.Role;
import school_library_task5.models.*;
import school_library_task5_library_service.Books;
import school_library_task5.enums.Gender;
import school_library_task5_library_service.Librarian;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mariam Bajah", 36, 2,1,Gender.FEMALE, Role.TEACHER);
        SnrStudent snrStudent = new SnrStudent("John Paul", 18, 303,2, Gender.MALE, Role.SENIOR_STUDENT);
        JnrStudent jnrStudent= new JnrStudent("Ngozi Unegbu",12, 403, 3,Gender.FEMALE, Role.JUNIOR_STUDENT);


        Books book1 = new Books("Things Fall Apart", "Chinua Achebe", 10);
        Books book2 = new Books("The Thing Around Your Neck", "Chimamanda Adichie", 12);

        Person person1 = new Person("Mariam Bajah", 36, 111, 1, Gender.FEMALE, Role.TEACHER);
        Person person2 = new Person("John Paul", 18, 303, 2, Gender.MALE, Role.SENIOR_STUDENT);
        Person person3 = new Person("Ngozi Unegbu", 12, 403, 3, Gender.FEMALE, Role.JUNIOR_STUDENT);
        //Implementation 1:

        List<Person> persons = new ArrayList<>();

        persons.add(jnrStudent);
        persons.add(teacher);
        persons.add(snrStudent);

        Collections.sort(persons, new ComparatorLib());

        for(Person person: persons){
            System.out.println(person.getFullName());
        }

        //Implementation 2;

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("jnrStudent");
        queue.add("snrStudent");
        queue.add("teacher");

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Librarian librarian = new Librarian();
        librarian.updateBookInventory(book1);
        librarian.updateBookInventory(book2);

        ArrayList<Books> bookInventory = librarian.getBooks();

        System.out.println(bookInventory);











    }
    }

