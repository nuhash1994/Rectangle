import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Rectangle extends Application{
	public void start (Stage primaryStage){
		
		TextInputDialog dialog= new TextInputDialog();
		dialog.setContentText("Enter the height of the rectangle");
		dialog.showAndWait();
		String height=dialog.getResult();
		double dblheight=Double.parseDouble(height);
		dialog.setContentText("Enter the width of the rectangle");
		dialog.showAndWait();
		String width=dialog.getResult();
		double dblwidth=Double.parseDouble(width);

		double area=dblheight*dblwidth;
		double perimeter=2*(dblheight+dblwidth);

		Alert result= new Alert(AlertType.INFORMATION);
		result.setContentText("The area of the rectangle is "+area+"\nThe perimeter of the rectangle is "+perimeter);
		result.showAndWait();
			


	}
}
