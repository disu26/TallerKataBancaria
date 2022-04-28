import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que hereda de la clase Statement y añade el atributo credito, también se sobreescribe el método
 * toString.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class CreditStatement extends Statement{
    private final Credit credit;

    /**
     * Constructor que recibe 3 parametros.
     *
     * @param date fecha del crédito
     * @param balance balance después del crédito
     * @param credit crédito que se realizó
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public CreditStatement(LocalDate date, Balance balance, Credit credit){
        super(date, balance);
        this.credit = Objects.requireNonNull(credit);
    }

    /**
     * Se sobreescribe el método to string.
     *
     * @return String con la información que se desea mostrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return super.date() + "\t\t" + credit.value() + "\t\t\t\t\t\t"  + super.balance().value();
    }
}
