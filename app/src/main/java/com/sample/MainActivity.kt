package com.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadWebViewWithHTMLFile()
    }

    fun loadWebViewWithHTMLFile(){

//Create WebView At Run Time
        var webView =  WebView(this)
//Create WebView At Run Time
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("file:///android_asset/indexx.html")
        setContentView(webView)


        val webSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true)
        webView.setWebChromeClient(WebChromeClient())
    }



}