package ui;

import java.awt.Event;
import java.util.EventListener;

/**
 * H�rt auf Events (F�r den "Abh�rer")
 * @author Katy
 *
 */
public interface UiEventListener extends EventListener{
	
	/**
	 * Wird bei einem Event aufgerufen
	 */

	void onUiEventFired(UiEvent event);

}
