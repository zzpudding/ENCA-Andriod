package application;

import java.io.IOException;
import java.util.ResourceBundle;
import de.fhl.enca.bl.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CleaningAgentModifier extends Application {

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/CleaningAgentModifier.fxml"), ResourceBundle.getBundle("resource.CleaningAgentModifier", User.getInterfaceLanguage().getLocale()));
		try {
			Scene scene = new Scene(loader.load());
			scene.getStylesheets().add(this.getClass().getResource("/css/TabPaneHeader.css").toString());
			primaryStage.setScene(scene);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		primaryStage.setTitle("Cleaning Agent Modifier");
		primaryStage.initStyle(StageStyle.UNIFIED);
		primaryStage.show();
	}
}