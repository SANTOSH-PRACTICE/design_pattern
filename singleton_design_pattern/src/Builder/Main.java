package Builder;

public class Main {
	public static void main(String[] args) {
	User user=	new User.UserBuilder().setEmailId("santosh@gami").setUserId("123").setUserName("santosh").build();
	
	System.out.println(user.toString());
	
	User user2=	User.UserBuilder.builder().setEmailId("aasdsd@gami").setUserId("12s").setUserName("Honrao").build();
	System.out.println(user2.toString());

	}

}
