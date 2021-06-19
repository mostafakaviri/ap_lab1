
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.*;

/**
 * The type Controller.
 */
public class Controller{

    private Double a = 0.0, b = 0.0, c = 0.0;

    private boolean variableCheck = true;

    private double counter = 0;

    private String operator = "";

    private ArrayList<String> data = new ArrayList<>();

    @FXML
    private Button nine;

    @FXML
    private TextField textField;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button dot;

    @FXML
    private Button seven;

    @FXML
    private Button sum;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button four;

    @FXML
    private Button tangant;

    @FXML
    private Button sine;

    @FXML
    private Button cosine;

    @FXML
    private Button reset;

    @FXML
    private Button submission;

    @FXML
    private Button power;

    @FXML
    private Button calculate;

    @FXML
    private Button multiply;

    @FXML
    private Button five;

    public String getScreenText(){
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < data.size(); i++){
            a.append(data.get(i));
        }
        String res = a.toString();
        return res;
    }

    /**
     * Gets one.
     *
     * @param event the event
     */
    @FXML
    void getOne(ActionEvent event) {

        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 1 ;
            counter++;
            data.add("1");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 1 ;
            counter++;
            data.add("1");
            textField.setText(getScreenText());

        }

    }

    /**
     * Gets two.
     *
     * @param event the event
     */
    @FXML
    void getTwo(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 2 ;
            counter++;
            data.add("2");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 2 ;
            counter++;
            data.add("2");
            textField.setText(getScreenText());

        }

    }

    /**
     * Power.
     *
     * @param event the event
     */
    @FXML
    void power(ActionEvent event) {
        variableCheck = false;
        counter = 0;

        operator = "^";
        data.add("^");
        textField.setText(getScreenText());
    }

    /**
     * Add dot.
     *
     * @param event the event
     */
    @FXML
    void addDot(ActionEvent event) {
        operator = "-";
        variableCheck = false;
        counter = 0;
        data.add("-");
        textField.setText(getScreenText());
    }

    /**
     * Gets zero.
     *
     * @param event the event
     */
    @FXML
    void getZero(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter);
            counter++;
            data.add("0");
            textField.setText(getScreenText());

        }

        else {
            b = b * Math.pow(10 ,counter);
            counter++;
            data.add("0");
            textField.setText(getScreenText());

        }
    }

    /**
     * Calculate button pressed.
     *
     * @param event the event
     */
    @FXML
    void calculateButtonPressed(ActionEvent event) {
        data.add("=");

        if (operator.equals("*")){
            c = a * b;
            data.add(c.toString());
            textField.setText(getScreenText());

        }
        if (operator.equals("/")){
            c = a / b;
            data.add(c.toString());
            textField.setText(getScreenText());
        }
        if (operator.equals("+")){
            c = a+b;
            data.add(c.toString());
            textField.setText(getScreenText());

        }
        if (operator.equals("-")){
            c = a - b;
            data.add(c.toString());
            textField.setText(getScreenText());
        }
        if (operator.equals("^")){
            c = Math.pow(a,b);
            data.add(c.toString());
            textField.setText(getScreenText());

        }
        if (operator.equals("sine")){
            c = Math.sin(a);
            data.add(c.toString());
            textField.setText(getScreenText());

        }
        if (operator.equals("cosine")){
            c = Math.cos(a);
            data.add(c.toString());
            textField.setText(getScreenText());

        }
        if (operator.equals("tangent")){
            c = Math.tan(a);
            data.add(c.toString());
            textField.setText(getScreenText());

        }
    }

    /**
     * Gets five.
     *
     * @param event the event
     */
    @FXML
    void getFive(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 5 ;
            counter++;
            data.add("5");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 5 ;
            counter++;
            data.add("5");
            textField.setText(getScreenText());

        }

    }

    /**
     * Sum.
     *
     * @param event the event
     */
    @FXML
    void sum(ActionEvent event) {
        operator = "+";
        variableCheck = false;
        counter = 0;
        data.add("+");
        textField.setText(getScreenText());

    }

    /**
     * Gets six.
     *
     * @param event the event
     */
    @FXML
    void getSix(ActionEvent event) {
        if (variableCheck){
            a = a + 6 * Math.pow(10 ,counter);
            counter++;
            data.add("6");
            textField.setText(getScreenText());

        }

        else {
            b = b + 6 * Math.pow(10 ,counter);
            counter++;
            data.add("6");
            textField.setText(getScreenText());

        }
    }

    /**
     * Gets three.
     *
     * @param event the event
     */
    @FXML
    void getThree(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 3 ;
            counter++;
            data.add("3");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 3 ;
            counter++;
            data.add("3");
            textField.setText(getScreenText());

        }

    }

    /**
     * Sine.
     *
     * @param event the event
     */
    @FXML
    void sine(ActionEvent event) {
        operator = "sine";
        variableCheck = false;
        counter = 0;
        data.add("sin ");
        textField.setText(getScreenText());

    }

    /**
     * Gets four.
     *
     * @param event the event
     */
    @FXML
    void getFour(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 4 ;
            counter++;
            data.add("4");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 4 ;
            counter++;
            data.add("4");
            textField.setText(getScreenText());

        }

    }

    /**
     * Multiply.
     *
     * @param event the event
     */
    @FXML
    void multiply(ActionEvent event) {

        variableCheck = false;
        counter = 0;
        operator = "*";
        data.add("*");
        textField.setText(getScreenText());

    }

    /**
     * Gets eight.
     *
     * @param event the event
     */
    @FXML
    void getEight(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 8 ;
            counter++;
            data.add("8");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 8 ;
            counter++;
            data.add("8");
            textField.setText(getScreenText());

        }

    }

    /**
     * Gets seven.
     *
     * @param event the event
     */
    @FXML
    void getSeven(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 7 ;
            counter++;
            data.add("7");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 7 ;
            counter++;
            data.add("7");
            textField.setText(getScreenText());

        }

    }

    /**
     * Gets nine.
     *
     * @param event the event
     */
    @FXML
    void getNine(ActionEvent event) {
        if (variableCheck){
            a = a * Math.pow(10 ,counter)+ 9 ;
            counter++;
            data.add("9");
            textField.setText(getScreenText());
        }

        else {
            b = b * Math.pow(10 ,counter)+ 9 ;
            counter++;
            data.add("9");
            textField.setText(getScreenText());

        }

    }

    /**
     * Cosine.
     *
     * @param event the event
     */
    @FXML
    void cosine(ActionEvent event) {

        operator = "cosine";
        variableCheck = false;
        counter = 0;
        data.add("cos ");
        textField.setText(getScreenText());

    }

    /**
     * Tangant.
     *
     * @param event the event
     */
    @FXML
    void tangant(ActionEvent event) {

        operator = "tangent";
        variableCheck = false;
        counter = 0;
        data.add("tan");
        textField.setText(getScreenText());

    }

    /**
     * Submission.
     *
     * @param event the event
     */
    @FXML
    void submission(ActionEvent event) {

        operator = "/";
        variableCheck = false;
        counter = 0;
        data.add("/");
        textField.setText(getScreenText());

    }

    /**
     * Reset.
     *
     * @param event the event
     */
    @FXML
    void reset(ActionEvent event) {
        a = 0.0;
        b = 0.0;
        c = 0.0;
        operator = "";
        variableCheck = true;
        counter = 0;
        data.clear();
        textField.setText(getScreenText());
    }

}
