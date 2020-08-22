package generics;

public class Email1 extends AbstractParam<String>{

	public static void main(String[] args) {
		Email1 email=new Email1();
		email.setValue("nitheshsgowda4.ng@gmail.com");
		System.out.println(email.getValue());
	}
}

