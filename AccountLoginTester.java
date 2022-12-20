class AccountLoginTester{

	public static void main(String a[])
	{
	
		System.out.println("Main method startd");
		AccountLogin.login(8197857508L);
		
		//for another string
		String value=AccountLogin.login("kshemapoojary264@gmail.com");
		System.out.println(value);
		System.out.println("main method ended");		
		
	}
}