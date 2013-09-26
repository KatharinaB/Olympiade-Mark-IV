package ui;

import java.awt.Event;

/**
 * Dient daf�r, das auf Events geh�rt werden kann (f�r den "Abzuh�renden")
 * @author Katy
 *
 */
public interface UiEventDispatcher {

	//F�gt Listener hinzu
	public void addListener(UiEventListener listener);
	//Entfernt Listener
	public void removeListener(UiEventListener listener);
	//Gibt Event weiter
	public void dispatch();
	
	
}
