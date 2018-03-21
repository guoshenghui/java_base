package base.cache;

public class MyAccountService {
	private MyCacheManager<Account> cacheManager;

	public MyAccountService() {
		cacheManager = new MyCacheManager<Account>();
	}

	public Account getAccountByName(String name) {
		Account result = cacheManager.getValue(name);
		if (result != null) {
			System.out.println("get Account from cache:" + name);
		} else {
			result = getFromDB(name);
			if (result != null) {
				cacheManager.addOrUpdateCache(name, result);
			}
		}
		return result;
	}

	public void reload() {
		cacheManager.evictCache();
	}

	public Account getFromDB(String name) {
		System.out.println("get Account from db");
		return new Account(name);
	}
}
