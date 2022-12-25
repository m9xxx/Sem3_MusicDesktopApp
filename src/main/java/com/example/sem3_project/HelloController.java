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
import javafx.scene.web.WebView;
import javafx.concurrent.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField SearchField;
    @FXML
    private Button SearchButton;
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
    private WebView webview;

    @FXML
    void playyeezus() {
//        webview.getEngine().load("https://www.youtube.com/watch?v=uU9Fe-WXew4");
        WebThread thread = new WebThread();
        thread.run(webview, "https://www.youtube.com/watch?v=uU9Fe-WXew4");
//        webaddr("https://www.youtube.com/watch?v=uU9Fe-WXew4").start();
    }

}