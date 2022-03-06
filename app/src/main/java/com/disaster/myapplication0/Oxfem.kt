package com.disaster.myapplication0

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_oxfem.*
import kotlinx.android.synthetic.main.content_oxfem.*

class Oxfem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oxfem)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        webviewoxfem.webViewClient = com.disaster.myapplication0.WebView.MyWebViewClint()

        webviewoxfem.loadUrl("https://www.oxfam.org/")


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

}
