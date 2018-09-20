package base.note;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 声明此注解没有使用Inherited元注解，此注解用在类上时，不会被子类继承
 * @author admin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedTest2 {
	String value();
}
