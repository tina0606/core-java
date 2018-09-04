import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Program36 {

	public static void main(String[]args)
	{
	 ZonedDateTime currentTime=ZonedDateTime.now();
	 ZonedDateTime currentTimeinAmerica= ZonedDateTime.now(ZoneId.of("America/New_York"));
	 ZonedDateTime currentTimeinEurope= ZonedDateTime.now(ZoneId.of("Europe/London"));
	 ZonedDateTime currentTimeinAsia= ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
	 
	 System.out.println("America:"+currentTimeinAmerica);
	 System.out.println("Europe:"+currentTimeinEurope);
	 System.out.println("Asia:"+currentTimeinAsia);
	
	
	}
	
}
