import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Stud1  {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age + "years");

    }

    public static void main(String[] args) {
        Stud1 s = new Stud1();
        s.name = "Arpitha";
        s.displayName();
        s.displayAge("15-03-2004");
        
    }
}