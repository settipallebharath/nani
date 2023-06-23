package stringcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
public static void main(String[] args) 
{
Resource rs=new ClassPathResource("application.xml");
BeanFactory bn=new XmlBeanFactory(rs);
student st=(student)bn.getBean("student");
st.disp();
	}
}
