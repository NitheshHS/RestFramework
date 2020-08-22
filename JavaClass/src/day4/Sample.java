package day4;

public class Sample {
	public static void main(String[] args) {
		Account ac=new Account();
		System.out.println("a/c_no\tName\tEmail\tammount");
		System.out.println(ac.getAcc_no()+"\t"+ac.getName()+"\t"+ac.getEmail()+"\t"+ac.getAmount());
		ac.setAcc_no(123456789);
		ac.setName("Nithesh");
		ac.setEmail("nitheshsgowda4.ng@gmail.com");
		ac.setAmount(0);
		System.out.println(ac.getAcc_no()+"\t"+ac.getName()+"\t"+ac.getEmail()+"\t"+ac.getAmount());
	}
}
