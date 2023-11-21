package SingletonDetails;

public class DBConection {
	private static DBConection instance;
	
	private DBConection() {
		System.out.println("DBConection is ok.");
	}
	/// create Factory method
	public static DBConection getInstace() {
		if(instance ==  null) {
			synchronized(DBConection.class) {
				if(instance== null) {
					instance = new DBConection();
				}
			}
			
		}
		
		return instance;
		
	}
	

}
