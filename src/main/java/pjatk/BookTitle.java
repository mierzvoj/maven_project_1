package pjatk;
//BookTitle annotation

import javax.validation.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // kiedy ma działać
@Target(ElementType.FIELD) // czego ma dotyczyć
@Constraint(validatedBy = BookValidator.class)

public @interface BookTitle {

    public String key() default "Book";

    String message() default "This is not a Book";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
