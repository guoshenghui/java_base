package base.cache;

public class Main {
	public static void main(String[] args) {
		MyAccountService mas = new MyAccountService();
		mas.getAccountByName("somebody");
		mas.getAccountByName("somebody");
		mas.reload();
		System.out.println("after reload...");
		mas.getAccountByName("somebody");
		mas.getAccountByName("somebody");
	}
}
