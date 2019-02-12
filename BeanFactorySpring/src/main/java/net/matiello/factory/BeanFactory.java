package net.matiello.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {

	private static final ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "beansSpring.xml" });

	public static <T> T get(String name) {
		return (T) context.getBean(name);
	}
}
