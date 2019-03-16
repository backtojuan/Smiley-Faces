package ui;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class SmileyFacesController {

    @FXML
    private Pane paneSurface;
    
    @FXML
    void Handle(MouseEvent event) {
    	
    	double x = event.getX();
    	double y =  event.getY();
    	
    	System.out.println(x+ " " + y);
    	Circle cara = new Circle(x,y,40, Color.YELLOW);
    	Circle ojoI = new Circle(x-12,y-10,8, Color.BLACK);
    	Circle ojoD = new Circle(x+12,y-10,8, Color.BLACK);
    	Arc boca = new Arc(x,y+10,20,20,180,180);
    	Arc pBoca = new Arc(x,y+13,15,15,180,180);
    	
    	paneSurface.getChildren().add(cara);
    	paneSurface.getChildren().add(ojoI);
    	paneSurface.getChildren().add(ojoD);
    	paneSurface.getChildren().add(boca);
    	paneSurface.getChildren().add(pBoca);
    	
    	pBoca.setFill(Color.WHITE);
    	boca.setFill(Color.BLACK);
    	

    }

}

    

