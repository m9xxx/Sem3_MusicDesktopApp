package com.example.sem3_project;

import javafx.scene.web.WebView;

public class WebThread extends Thread implements WebThreadInterface {
    @Override
    public void run(WebView webview, String url){
        webview.getEngine().load(url);
    }

}
