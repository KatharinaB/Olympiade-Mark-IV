package ui.eventHandling;

public class UiEvent {
	
	private String message;
	
	public UiEvent(String msg){
		this.message = msg;
	}
	
	public String getMessage(){
		return message;
	}

}
