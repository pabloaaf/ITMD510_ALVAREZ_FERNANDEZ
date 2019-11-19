package professor;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.ToolKit;

public class IndexProfController extends Application {
	@FXML
	private Pane ChangingPane;
	
	@Override
	public void start(Stage secondaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("IndexProf.fxml"));
			Scene scene = new Scene(root,640, 480);
			secondaryStage.setTitle("Professor Site");
			secondaryStage.setScene(scene);
			secondaryStage.setMaximized(true);
			secondaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setChangingPane(String PanelNuevo) {
		// cambiar panel pasando el nombre de la venta a la que se quiere ir
		try {
			ChangingPane.getChildren().clear();
			ChangingPane.getChildren().add((Node) FXMLLoader.load(getClass().getResource(PanelNuevo)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ChangingPaneProfArea(){
		setChangingPane("DataPane.fxml");
	}
	
	public void ChangingPaneSetGrade(){
		setChangingPane("DataPane.fxml");
	}
	
	public void TKClose() {
		ToolKit.TKClose();
	}
	
	public void TKSession() {
		ToolKit.TKSession();
	}
	
	public void TKHelp() {
		new ToolKit().TKHelp();
	}
	
	public void TKSpecificHelp(){
		new ToolKit().TKSpecificHelp();
	}
	
	public void TKAboutUs(){
		new ToolKit().TKAboutUs();
	}
}
