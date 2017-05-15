package totev4_hf_04;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
//api: dc11da80ecae3628b048c9ccf59f086f


public class Main extends Application {
	public static ArrayList<Film> filmek = new ArrayList<Film>();

	
	@Override
	public void start(Stage primaryStage) {
		try {

			Film film1 = new Film("Mamma-mia", 7.4);
			Film film2 = new Film("The Trainie", 9.5);
			filmek.add(film1);
			filmek.add(film2);
			
			
			GridPane rootPane = new GridPane();
			Scene scene = new Scene(rootPane,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {


		launch(args);
	}
}
