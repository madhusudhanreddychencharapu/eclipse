package temp;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Meta Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os();
	int version();
}


@SmartPhone(os="Android",version = 6)
class NokiaAseries{
	String model;
	int size;
	public NokiaAseries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
	
	
}
public class AnnotationDemo {

	public static void main(String[] args) {
		
		NokiaAseries objAseries= new NokiaAseries("Fire", 5);
		Class c=objAseries.getClass();
		
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		
	}

}
