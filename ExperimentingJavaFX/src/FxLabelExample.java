import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FxLabelExample extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		//Create text fields
		TextField firstNameFld = new TextField();
		TextField lastNameFld = new TextField();
		
		//Create labels
		Label firstNameLbl = new Label("_First Name: ");
		Label lastNameLbl = new Label("_Last Name: ");
		
		//Bind the label to the according field
		lastNameLbl.setLabelFor(lastNameFld);
		//Set mnemonic parsing to the Label
		lastNameLbl.setMnemonicParsing(true);
		
		firstNameLbl.setLabelFor(firstNameFld);
		firstNameLbl.setMnemonicParsing(true);
		
		//Create GridPane
		GridPane root = new GridPane();
		//Add the Labels and Fields to the GridPane
		root.addRow(0, firstNameLbl, firstNameFld);
		root.addRow(1, lastNameLbl, lastNameFld);
		//Set the size of the GridPane
		root.setMinSize(350, 250);
		
		/*
		 * 
		 * Set the padding of the GridPane
		 * Set the border-sytle of the GridPane
		 * Set the border-width of the GridPane
		 * Set the border-insets of the GridPane
		 * Set the border-radius of the GridPane
		 * Set the border-color of the GridPane
		 * 
		 */
		root.setStyle("-fx-padding: 10;" + 
					"-fx-border-style: solid inside;" +
					"-fx-border-width: 2;" +
					"-fx-border-insets: 5;" +
					"-fx-border-radius: 5;" +
					"-fx-border-color: green;");
		//Create the Scene
		Scene scene = new Scene(root);
		//Add the scene to the Stage
		stage.setScene(scene);
		//Set the title of the stage
		stage.setTitle("A Label Example");
		//Display the stage
		stage.show();
		
	}
}
