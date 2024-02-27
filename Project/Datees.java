import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Datees {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fDate = LocalDate.now().format(formatter);
        System.out.println(fDate);
    }
}
