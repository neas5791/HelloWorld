
public class Message {
	private String message;

	public Message() {
		this.message = "Greetings\nThis is the default message!";
	}

	public Message(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
