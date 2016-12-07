package rs.ac.bg.etf.kdp.bi246;

public interface MessageBox<T>
{
	public void send(Message<T> msg, Priority prior, long timeToLive);
	public Message<T> receive(long timeToWait, Status status);
}
