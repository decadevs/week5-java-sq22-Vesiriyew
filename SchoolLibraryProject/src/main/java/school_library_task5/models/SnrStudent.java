package school_library_task5.models;

import school_library_task5.enums.Role;
import school_library_task5.enums.Gender;

public class SnrStudent extends Person {

    public SnrStudent(String fullName, int age, int id, int priorityLabel, Gender gender, Role role) {
        super(fullName, age, id, priorityLabel, gender, role);
    }
}
