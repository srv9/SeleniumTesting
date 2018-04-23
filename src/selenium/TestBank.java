package selenium;

public class TestBank {

	public static void main(String[] args) {
	     System.out.println("Kotak Methods");
		Kotak bk=new Kotak();  //Static Polymr
		bk.credit();
		bk.Debit();
		bk.TransferMoney();
		bk.OnlineBank();
		System.out.println("************");
		USBank us= new Kotak(); //Dynamic Poly --Top Casting
		us.credit();
		us.Debit();
		us.TransferMoney();
        System.out.println("USBank Methods");
	}

}
