package com.example.rotationseksempel;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class RotationExample extends Application {
    @Override
    public void start(Stage stage) {
        //Tegn første rektangel
        Rectangle rectangle1 = new Rectangle(150, 75, 200, 150);
        rectangle1.setFill(Color.BLUE);
        rectangle1.setStroke(Color.BLACK);

        //Tegn andet rektangel
        Rectangle rectangle2 = new Rectangle(150, 75, 200, 150);
        rectangle2.setFill(Color.BURLYWOOD);
        rectangle2.setStroke(Color.BLACK);

        //Lav rotationen
        Rotate rotate = new Rotate();
        rotate.setAngle(20);
        //Sæt omdrejningspunktet for rotationen
        rotate.setPivotX(150);
        rotate.setPivotY(225);  // 75+150

        //Roter andet rektangel
        rectangle2.getTransforms().addAll(rotate);

        //Sæt knap på

        Button knap = new Button("Rotér rektangel 10 grader");
        knap.setOnAction((event) -> {
            rotate.setAngle(rotate.getAngle()+10);
        });


        //Sæt dem i gruppe og sæt dem på scenen
        Group root = new Group(rectangle1, rectangle2, knap);
        Scene scene = new Scene(root, 600, 300);

        //Vis scenen på vinduet (stage)
        stage.setTitle("Rotation transformation example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}