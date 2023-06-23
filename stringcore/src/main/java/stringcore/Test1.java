package stringcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test1 {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		Customer c=(Customer)bn.getBean("cst1");
		c.disp();


	}

}
