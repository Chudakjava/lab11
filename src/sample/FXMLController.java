package sample;
import MyExceptions.MyException;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.scene.control.Button;




public class FXMLController implements Initializable {

    @FXML
    private Button minus;

    @FXML
    private Button powxy;

    @FXML
    private Button dot;

    @FXML
    private Button seven;

    @FXML
    private Button powthreex;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button percent;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button four;

    @FXML
    private Button sqrt1;

    @FXML
    private Button divide;

    @FXML
    private Button multiply;

    @FXML
    private Button five;

    @FXML
    private Button xpow2;

    @FXML
    private Button ac;

    @FXML
    private Button six;

    @FXML
    private TextField txt_field;

    @FXML
    private Button one;

    @FXML
    private Button onedivx;

    @FXML
    private Button plus;

    @FXML
    private Button equal;

    @FXML
    private Button powtenx;

    @FXML
    private Button nine;


    double result = 0;
    double input1;
    double input2;
    int ps;
    double point;


    @FXML
    public void Calculation(javafx.event.ActionEvent event) throws MyException {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if (event.getSource() == one) {
            txt_field.appendText("1");
        } else if (event.getSource() == two) {
            txt_field.appendText("2");
        } else if (event.getSource() == three) {
            txt_field.appendText("3");
        } else if (event.getSource() == four) {
            txt_field.appendText("4");
        } else if (event.getSource() == five) {
            txt_field.appendText("5");
        } else if (event.getSource() == six) {
            txt_field.appendText("6");
        } else if (event.getSource() == seven) {
            txt_field.appendText("7");
        } else if (event.getSource() == eight) {
            txt_field.appendText("8");
        } else if (event.getSource() == nine) {
            txt_field.appendText("9");
        } else if (event.getSource() == zero) {
            txt_field.appendText("0");
        } else if (event.getSource() == dot) {
            txt_field.appendText(".");
        } else if (event.getSource() == divide) {
            input1 = Double.parseDouble(txt_field.getText());

            txt_field.setText("");
            ps = 4;
            point = 0;
        } else if (event.getSource() == ac) {
            txt_field.setText("");
            input1 = 0;
            input2 = 0;
            ps = 0;


        } else if (event.getSource() == multiply) {
            input1 = Double.parseDouble(txt_field.getText());

            txt_field.setText("");
            ps = 3;
            point = 0;
        } else if (event.getSource() == plus) {
            input1 = Double.parseDouble(txt_field.getText());

            txt_field.setText("");
            ps = 1;
            point = 0;

        } else if (event.getSource() == minus) {
            input1 = Double.parseDouble(txt_field.getText());

            txt_field.setText("");

            ps = 2;
            point = 0;
        } else if (event.getSource() == sqrt1) {

            txt_field.setText("");
            ps = 5;
            point = 1;
        } else if (event.getSource() == onedivx) {
            input1 = Double.parseDouble(txt_field.getText());
            txt_field.setText("");
            ps = 7;
            point = 1;
        } else if (event.getSource() == xpow2) {
            txt_field.setText("");
            ps = 8;
            point = 0;
        } else if (event.getSource() == powtenx) {
            txt_field.setText("");
            ps = 9;
            point = 0;
        } else if (event.getSource() == powthreex) {
            txt_field.setText("");
            ps = 10;
            point = 0;
        } else if (event.getSource() == powxy) {
            txt_field.setText("");
            ps = 11;
            point = 0;
        } else if (event.getSource() == equal && ps > 0) {
            input2 = Double.parseDouble(txt_field.getText());
            DecimalFormat td = new DecimalFormat("#.00");
            try {
                switch (ps) {

                    case 1 -> {
                        result = input1 + input2;
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 2 -> {
                        result = input1 - input2;
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 3 -> {
                        result = input1 * input2;
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 4 -> {
                        if (input2 == 0) {
                            throw new MyException();
                        }
                        result = input1 / input2;

                        txt_field.setText(String.valueOf(td.format(result)));

                    }
                    case 5 -> {
                        result = Math.sqrt(input2);
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 6 -> {
                        result = input1 % input2;
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 7 -> {
                        result = 1 / input1;
                        txt_field.setText(String.valueOf(td.format(result)));
                    }
                    case 8 -> {
                        result = Math.pow(input2, 2);
                        txt_field.setText(td.format(result));

                    }
                    case 9 -> {
                        result = Math.pow(10, input2);
                        txt_field.setText(td.format(result));

                    }
                    case 10 -> {
                        result = Math.pow(input2, 3);
                        txt_field.setText(td.format(result));

                    }
                    case 11 -> {
                        result = Math.pow(input1, input2);
                        txt_field.setText(td.format(result));

                    }
                }
            } catch (ArithmeticException e) {
                alert.setTitle("Ошибка");
                alert.setHeaderText("");
                alert.showAndWait();
            }
            ps = 0;



        }
    }


        @Override
      public void initialize(URL url, ResourceBundle rb){

      }

  /* public void myETest(double input1,double input2){
        double x, z;
        try{
            x=Double.parseDouble(s);
            z=Math.sqrt(x/y);
        } catch(ArithmeticException e){
            System.out.println("Деление на ноль");
        } catch(NumberFormatException e){
            System.out.println("Корень из отрицательного числа!");
        }
    };*/


    }


