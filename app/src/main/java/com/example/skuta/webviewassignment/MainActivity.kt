package com.example.skuta.webviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.web_view)

        webViewSetup()
    }

    private fun webViewSetup() {
        webView.webViewClient = WebViewClient()

        webView.apply {
            loadUrl("https://cls.d155.org")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true


        }

    }

    override fun onBackPressed() {
        if (webView.canGoBack())
            webView.goBack()
        else
            super.onBackPressed()
    }

}