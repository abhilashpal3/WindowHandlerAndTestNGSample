package WindowHandlerAndTestNG.WindowHandlerAndTestNG;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseMethods.LoadCredentialProperties;

public class FlightBookings extends IRCTCUptoLogin {

	@Test
	public void Bookfight() throws IOException {

		System.out.println("Flight booking started");

		LoadCredentialProperties Cred = new LoadCredentialProperties();

		Enterusername(Cred.getUsername());
		WindowsHandles();
	}
}
