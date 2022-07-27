package com.sample

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

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
        webView.loadUrl("https://widget-android-8a482.web.app/")
        setContentView(webView)


        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.setInitialScale(1)
        webView.settings.useWideViewPort = true
       webView.settings.loadWithOverviewMode = true

    }

}