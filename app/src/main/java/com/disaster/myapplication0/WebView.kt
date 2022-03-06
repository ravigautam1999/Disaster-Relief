package com.disaster.myapplication0

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_web_view.*
import kotlinx.android.synthetic.main.content_web_view.*

class WebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        setSupportActionBar(toolbar)

        webview.webViewClient=MyWebViewClint()

        var btngo = findViewById<Button>(R.id.btnFloodsgo)

        btngo.setOnClickListener ({
            webview.loadUrl("https://www.google.co.in/")
        })

        btnback.setOnClickListener({
            if (webview.canGoBack())
                webview.goBack()
            else Toast.makeText(this, "No history available ", Toast.LENGTH_SHORT).show()})

        btnfor.setOnClickListener({
            if (webview.canGoForward())
                webview.goForward()
            else
                Toast.makeText(this, "No history available ", Toast.LENGTH_SHORT).show()
        })
    }

    class MyWebViewClint : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }
    }

}


