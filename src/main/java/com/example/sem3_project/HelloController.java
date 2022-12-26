package com.example.sem3_project;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.web.WebView;
import javafx.concurrent.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.paint.Color.*;

public class HelloController {

    CheckConnect connect = new CheckConnect();

    @FXML
    private VBox OBJ_00;
    @FXML
    private VBox OBJ_01;
    @FXML
    private VBox OBJ_02;
    @FXML
    private VBox OBJ_10;
    @FXML
    private VBox OBJ_11;
    @FXML
    private VBox OBJ_12;
    @FXML
    private VBox OBJ_20;
    @FXML
    private VBox OBJ_21;
    @FXML
    private VBox OBJ_22;


    @FXML
    public ImageView yeezus;
    @FXML
    public Label connectstatus;


    @FXML
    private WebView webview;
    @FXML
    void playyeezus() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=uU9Fe-WXew4&list=OLAK5uy_lJ0yXPKvCREyQl6Bcxp6I8CAfrD-yX-VA");
    }
    @FXML
    void playye() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=no1YszVVybo&list=OLAK5uy_muY3sZz_bPKYuLgpQT-XpRkJlg5Ic73dw");
    }
    @FXML
    void playjik() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=T58tRXzjC7c&list=OLAK5uy_nEFBjGaOppv2c3YRocckDXUNhmD-SjPTg");
    }
    @FXML
    void play808() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=d9BMPmfxaoM&list=OLAK5uy_nz1xgXV49PGli0x8q3Y1XxparfuNRbe18");
    }

    @FXML
    void playgraduation() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=WwYbTxOZF0k&list=OLAK5uy_n4negEHWAKSsnUfvxnK-hbGuYASJ1IBa4");
    }
    @FXML
    void playcd() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=OTZzjAU0Kg0&list=OLAK5uy_mvz7Tr6ZqTX0GKxE4lP5ifCaE9Sx-AEjc");
    }
    @FXML
    void playdonda() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=J8k-73s2fHw&list=OLAK5uy_mt1CozrMsSYFHXkkpeHkmk5hmxdsXRTnw");
    }
    @FXML
    void playtlop() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=S_2C0ZX0M84&list=OLAK5uy_nQYMqqoZhBT_6rQTUvqstgeMp44nd7itU");
    }
    @FXML
    void playmisharal() {
        webview.setPrefHeight(210);
        webview.setPrefWidth(1200);
        webview.getEngine().load("https://music.youtube.com/watch?v=KR5-JjfSihI&list=OLAK5uy_klgtajEHKAo1WVqx-zJdoJLW0iDSoGfJQ");
    }
    @FXML
    void Start() {
        connect.setDaemon(true);
        connect.start();
        connectstatus.setText(connect.status);
//        if (connect.connected == true){
//            connectstatus.setText("Internet connection is stable!");
//            connectstatus.setTextFill(GREEN);
//            connectstatus.setFont(Font.font ("System", 24));
//        }
//        else{
//            connectstatus.setText("No connection!");
//            connectstatus.setTextFill(RED);
//            connectstatus.setFont(Font.font ("System", 24));
//            OBJ_00.isDisabled();
//            OBJ_01.isDisabled();
//            OBJ_02.isDisabled();
//            OBJ_10.isDisabled();
//            OBJ_11.isDisabled();
//            OBJ_12.isDisabled();
//            OBJ_20.isDisabled();
//            OBJ_21.isDisabled();
//            OBJ_22.isDisabled();
//        }
    }
}