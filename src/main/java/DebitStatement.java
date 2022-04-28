import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que hereda de la clase Statement y añade el atributo debito, también se sobreescribe el método
 * toString.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class DebitStatement extends Statement{
    private final Debit debit;

    /**
     * Constructor que recibe 3 parametros.
     *
     * @param date fecha del débito
     * @param balance balance después del débito
     * @param debit debito que se realizó
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public DebitStatement(LocalDate date, Balance balance, Debit debit){
        super(date, balance);
        this.debit = Objects.requireNonNull(debit);
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
        return super.date() + "\t\t\t\t\t" + debit.value() + "\t\t\t" + super.balance().value();
    }
}
