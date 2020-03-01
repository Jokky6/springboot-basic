package MainApplication.validators;

import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface PasswordEqual {
    String message() default "password are not equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
