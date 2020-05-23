package pjatk;

import javax.validation.*;


public class BookValidator implements ConstraintValidator<BookTitle, String> {
    @Override
    public boolean isValid(String title, ConstraintValidatorContext constraintValidatorContext) {
        if (title.equals("Book"));
        return true;
    }

    @Override
    public void initialize(BookTitle constraintAnnotation) {
        return;
    }

}
