package apim.github.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode {

	public static void main(String args[]) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
		test11();
		test12();
	}

	private static void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-1.xml");
		Customer c = (Customer) ctx.getBean("customer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		ctx.close();
	}

	private static void test2() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-1.xml");
		Customer c1 = (Customer) ctx.getBean("customer");
		Customer c2 = (Customer) ctx.getBean("customer");
		System.out.println(c1 == c2);
		ctx.close();
	}

	private static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-1.xml");
		CustomerCBI c = (CustomerCBI) ctx.getBean("customerCBI");
		System.out.println(c.getcId() + ", " + c.getcName());
		ctx.close();
	}

	private static void test4() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-2.xml");
		Customer c = (Customer) ctx.getBean("customer");
		SpecialCustomer spc = (SpecialCustomer) ctx.getBean("spCustomer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(spc.getId() + ", " + spc.getName() + ", " + spc.getBalance() + ", " + spc.getLoan());
		ctx.close();
	}

	private static void test5() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-3.xml");
		CustomerDI c = (CustomerDI) ctx.getBean("customer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(c.getAddress().getLocation() + ", " + c.getAddress().getCity());
		ctx.close();
	}

	private static void test6() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-4.xml");
		Dissertation obj = (Dissertation) ctx.getBean("dissertation");
		System.out.println(obj.getMentorList());
		System.out.println(obj.getApproverSet());
		System.out.println(obj.getReferenceMap());
		System.out.println(obj.getChapterProperties());
		ctx.close();
	}

	private static void test7() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-6.xml");
		CustomerAnnot c = (CustomerAnnot) ctx.getBean("customerAnnot");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		ctx.close();
	}

	private static void test8() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-6.xml");
		CustomerAnnot c = (CustomerAnnot) ctx.getBean("customerAnnot");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(c.getAddress().getLocation() + ", " + c.getAddress().getCity());
		ctx.close();
	}

	private static void test9() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context-6.xml");
		ctx.getBean("customerPC");
		ctx.close();
	}

	private static void test10() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CustomerAnnot c = (CustomerAnnot) ctx.getBean("customer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(c.getAddress().getLocation() + ", " + c.getAddress().getCity());
		ctx.close();
	}

	private static void test11() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Cfg1.class, Cfg2.class);
		CustomerAnnot c = (CustomerAnnot) ctx.getBean("customer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(c.getAddress().getLocation() + ", " + c.getAddress().getCity());
		ctx.close();
	}

	private static void test12() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigVA.class);
		CustomerAnnot c = (CustomerAnnot) ctx.getBean("customer");
		System.out.println(c.getId() + ", " + c.getName() + ", " + c.getBalance());
		System.out.println(c.getAddress().getLocation() + ", " + c.getAddress().getCity());
		ctx.close();
	}
}