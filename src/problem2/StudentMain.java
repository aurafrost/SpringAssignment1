package problem2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("applicationContext2.xml");
		BeanFactory f=new XmlBeanFactory(r);
		
		Student s=(Student)f.getBean("studentbean");
		System.out.println(s.toString());
	}

}
