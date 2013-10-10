import db.Database;
import ui.MainFrame;

/**
 * 
 * @author Katy
 *
 */
public class Main {
	
	private static MainFrame mainFrame;
	private static Database db;
	
	public static void main(String[] args) {
		db = new Database();
		mainFrame = new MainFrame(1280,1024);
		
		//db.closeDB();
	}

}
