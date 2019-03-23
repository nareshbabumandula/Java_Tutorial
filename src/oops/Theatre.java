package oops;

public abstract class Theatre {
	
	abstract void CarParking(); //body less or abstract methods
	abstract void BikeParking();
	abstract void OnlineBooking();
	abstract void TicketBooking();
	abstract void VIPBooking();
	abstract void FireAndSafety();
	abstract void Cafeteria();
	
	public void SoundSystem()
	{
		System.out.println("Sound system should be dolby digital");
	}
}
