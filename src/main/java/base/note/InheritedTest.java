package base.note;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 声明此注解使用了Inherited元注解，此注解用在类上时，会被子类继承
 * @author admin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedTest {
	String value();
}
