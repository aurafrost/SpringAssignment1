package problem4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import problem4.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("applicationContext4.xml");
		BeanFactory f=new XmlBeanFactory(r);
		
		Employee e=(Employee)f.getBean("empbean");
		System.out.println(e.toString());
	}

}
