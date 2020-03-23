package tpsi.labs.lab2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Bill", "Gates","bill@gates.pl");
        Person p2 = new Person("Gal", "Anonim", "aaa@bb.com");
        System.out.println(p1);
        System.out.println(p2);
        
        
        Person nauczyciel = new Teacher ("Jan","Kowalski","informatyk","it@it.pl");
        System.out.println(nauczyciel);
        
        
        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");
        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C+");
        
        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;
        
        for(EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }
        //zadanie 3
        System.out.println("\n\n\n === zad 3: ===");
        Student ja = new Student ("Tomasz","Młynek","aa@bb.pl","1234abc");
        ja.addGrade(3);
        ja.addGrade(4);
        ja.addGrade(3);
        System.out.println("Średnia = " + ja.getGradesAverage());
        
        //zadanie 4. 
        
        System.out.println("\n\n\n\n\n === zad 4: ===");
        University zut2 = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl"); //tworzymy uniwersytet
        //tworzymy 2 wydziały
        Faculty wi = new Faculty ("wi@zut.edu.pl","Wydzial informatyki");
        Faculty wa = new Faculty ("wa@zut.edu.pl","Wydział architektury");
        
        //tworzymy nauczycieli, po 2 na kazdy wydzial
        Teacher wi_t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C+");
        Teacher wi_t2 = new Teacher("Jerzy", "Pejaś", "dziekan@zut.edu.pl", "Algorytmy");
        Teacher wa_t1 = new Teacher("John", "Example", "dfdfdf@fake.org", "Podstawy doboru materiałów");
        Teacher wa_t2 = new Teacher("Krzysztof", "Kowalski", "dziekan@zut.edu.pl", "Matematyka");
        
        //przypisujemy naszych nauczycieli do konkretnych wydziałów
        wi.addTeacher(wi_t1);
        wi.addTeacher(wi_t2);
        wa.addTeacher(wa_t1);
        wa.addTeacher(wa_t2);
        
        //przypisujemy te 2 wydzialy wraz z ich nauczycielami do zutu
        zut2.addFaculty(wi);
        zut2.addFaculty(wa);
        
        
        System.out.println(zut2);
        for (Faculty faculty : zut2.getFaculties()) { 
            System.out.println("    Wydział: " + faculty.toString());
            for (Teacher teacher : faculty.getTeachers()) { 
                System.out.println("        Nauczyciel: " + teacher.toString()); 
            }
            
        }
        
    }
}
