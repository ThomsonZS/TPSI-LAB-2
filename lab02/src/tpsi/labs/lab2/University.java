package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class University implements EmailRecipient {
    private String emailAddress;
    private String name;
    private List<Faculty> faculties = new ArrayList<>();// do zadania 4

    public List<Faculty> getFaculties() {// do zadania 4
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {// do zadania 4
        this.faculties = faculties;
    }
    
    public void addFaculty(Faculty faculty) {// do zadania 4
        faculties.add(faculty);
    }
    
    public University(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.emailAddress;
    }
}
