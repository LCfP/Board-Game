package Game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BoardGame extends Application{

	public static TicTacToe game;
	public static Rectangle[][] fields;

	public static void main(String[] args)
	{
		game = new TicTacToe(3);


		launch();
	}

	public void start(Stage mainStage) throws Exception
	{
		Pane pane = new Pane();
		Scene scene = new Scene(pane,600,600);
		
		initializeScreen();
		
		mainStage.setScene(scene);
		mainStage.show();
	}

	public void initializeScreen()
	{
		fields = new Rectangle[game.getSize()][game.getSize()];
				
		Rectangle r = new Rectangle();
		r.setX(50);
		r.setY(50);
		r.setWidth(200);
		r.setHeight(100);
	}
}
