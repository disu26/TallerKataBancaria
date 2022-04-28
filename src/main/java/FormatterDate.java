import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase para darle formato a la fecha,
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class FormatterDate {
    public static LocalDate localDateOf(String date){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, dtf);
    }
}
