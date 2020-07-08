package ee219;

import java.net.URI;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;


public class CharCount3 {

	static int charCount(String s, char c) {
		
		int num=0;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) num++;
		}
	return num;
		
	
	}
	
	public static void main(String args[]) {
		  
		   System.out.println(charCount("stephens",'s'));
		  /* try {
		   URI uri= new URI("https://www.google.com/search?safe=strict&rlz=1C1CHBF_enIE772IE772&sxsrf=ALeKk02SwFT95oiUpQTwq4tov5PfCWJeYw%3A1586973543968&ei=Z0uXXqTWOoGl1fAP7rq56Ag&q=tictactoe&oq=tictactoe&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIECCMQJzIECAAQQzIECAAQCjIECAAQCjIECAAQCjIECAAQCjIECAAQCjIECAAQCjIECAAQCjoECAAQR0oNCBcSCTktNzlnMGcxMkoLCBgSBzktMWcwZzJQ_hNY_hNg5RVoAHACeACAAUOIAUOSAQExmAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwjkpeySgevoAhWBUhUIHW5dDo0Q4dUDCAw&uact=5");
		   java.awt.Desktop.getDesktop().browse(uri);
		   }
		   catch (Exception e) {
			   
			   e.printStackTrace();
			  } */
		}
}
