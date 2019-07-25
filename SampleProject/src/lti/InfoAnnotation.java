package lti;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // When to process
@Target(ElementType.METHOD) //Where to apply annotation whether Field, Class, Method

public @interface InfoAnnotation 
{
	int value(); /// Annotation Variable
	String name(); /// Annotation Variable

}
