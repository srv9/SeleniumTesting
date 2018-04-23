package selenium;

public class Kotak implements USBank{

	
	@Override
	public void credit() {
		System.out.println("Kotak--Credit balance");
		
	}

	@Override
	public void Debit() {
		System.out.println("Kotak--Debit Balance");
		
		
	}

	@Override
	public void TransferMoney() {
		System.out.println("Kotak Transfer Money");
		
		
	}
	public void OnlineBank(){
		System.out.println("Kotak--Online Service");
	}

}
