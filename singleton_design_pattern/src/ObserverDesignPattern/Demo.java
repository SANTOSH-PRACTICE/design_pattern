package ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		YoutubeChannel channel=new YoutubeChannel();
//		Subcriber aman=new Subcriber("aman");
//		channel.subcribe(aman);
//		
//		
//		
//		
//		Subcriber rman=new Subcriber("rman");
//		channel.subcribe(rman);
		
		Subject channel=new YoutubeChannel();
		Observer aman=new Subcriber("aman");
		channel.subcribe(aman);
		
		
		
		
		Observer rman=new Subcriber("rman");
		channel.subcribe(rman);
		
		channel.newVideoUploaded("learn design pattern");
		channel.newVideoUploaded("learn flutter ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to upload video");
			System.out.println("Press 2 create new subsciber");
			System.out.println("Press 3 exit");
			
			int c= Integer.parseInt(br.readLine());
					
if(c==1)
{
	//new video upload code
	System.out.println("Enter video title");
	String videoTitle=br.readLine();
	channel.newVideoUploaded(videoTitle);
}


else if(c==2)
{
	//create new subscribe
	System.out.println("Enter name of subsciber");
	String subName=br.readLine();
	Observer subcriber= new Subcriber(subName);
	channel.subcribe(subcriber);
	
}
else if(c==3)
{
	//exit code
	System.out.println("Thank for Using app");
}
else
{
	//wrong input
	System.out.println("Wrong input");
	break;

}

			
			
		}

		
	}




}
