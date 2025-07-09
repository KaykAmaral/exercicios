package exercicios.ex11_1.model.Exceptions;

import java.io.Serial;

public class AccountException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public AccountException (String msg) { super(msg); }


}
