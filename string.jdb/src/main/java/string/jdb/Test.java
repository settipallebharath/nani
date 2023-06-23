package string.jdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext mk=new ClassPathXmlApplicationContext("application.xml");
		EmpDao d=(EmpDao)mk.getBean("edao");
	    Employee emp=new Employee();
	    emp.setId(03);
	    emp.setName("rajesh");
	    emp.setCmp("apple");
	    d.save(emp);
	    //d.update(emp);
	  // d.delete(emp);
	    System.out.println("done");
	}

}
