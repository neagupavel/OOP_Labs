package Lab9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DividerApplication extends Application {

    private Label lblInput1 = new Label("Input 1");
    private Label lblInput2 = new Label("Input 2");
    private TextField txtNum1 = new TextField();
    private TextField txtNum2 = new TextField();
    private Button btnDivide = new Button("Divide");
    private Label lblResult = new Label("Result: ");
    private Label lblDisplayResult = new Label();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane calculatorPane = new GridPane();
        calculatorPane.setHgap(10);
        calculatorPane.setVgap(10);

        Scene scene = new Scene(calculatorPane, 600, 400);
        primaryStage.setTitle("Divider");
        primaryStage.setScene(scene);
        primaryStage.show();

        calculatorPane.add(lblInput1, 0, 0);
        calculatorPane.add(txtNum1, 1, 0);
        calculatorPane.add(lblInput2, 0, 1);
        calculatorPane.add(txtNum2, 1, 1);
        calculatorPane.add(btnDivide, 1, 2);
        calculatorPane.add(lblResult, 0, 3);
        calculatorPane.add(lblDisplayResult, 1, 3);

        calculatorPane.setAlignment(Pos.CENTER);


        btnDivide.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                String result;

                try {
                    double input1 = Double.parseDouble(txtNum1.getText());
                    double input2 = Double.parseDouble(txtNum2.getText());
                    result = String.valueOf(input1 / input2);

                    if (input2 == 13) {
                        throw new UnluckyException("13 is an unlucky number");
                    }
                } catch (UnluckyException e) {
                    result = e.getMessage();
                } catch (ArithmeticException e) {
                    result = "ERROR " + e.getMessage();
                } catch (NumberFormatException e) {
                    result = "ERROR " + e.getMessage();
                } catch (Exception e) {
                    result = "ERROR " + e.getMessage();
                }
                lblDisplayResult.setText(result);
            }
        });
    }
}