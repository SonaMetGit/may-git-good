package MavenTraining.Mavenjava;

import org.testng.annotations.Test;

public class RESTAPITest {
	
	
	@Test
	public void postJira()
	{
		System.out.println("postJira");
		// these two lines are added to test GitHub working (supposedly/assuming 2nd user)
		System.out.println("postJira2");
		System.out.println("postJira3");

		// these lines are added to test GitHub working(by 1st user after 2nd user updated the code)
		System.out.println("postJira4");
		System.out.println("postJira5");
		System.out.println("postJira6");
	}
	
	@Test
	public void deleteTwitter()
	{
		System.out.println("deleteTwitter");
	}
	@Test
	public void deleteTwitter1()
	{// method added to test branching concept in Git
		System.out.println("deleteTwitter 1");
	}

}
