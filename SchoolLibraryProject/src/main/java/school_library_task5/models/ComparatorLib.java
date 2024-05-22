package school_library_task5.models;

import java.util.Comparator;

public class ComparatorLib implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPriorityLabel() > p2.getPriorityLabel()){
            return 1;

    }else if ((p1.getPriorityLabel()< p2.getPriorityLabel())){
            return -1;

        }else {
            return  0;
        }



}
}




