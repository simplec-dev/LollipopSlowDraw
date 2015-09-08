package com.simplec.phonegap.plugins.slowdraw;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginManager;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SimpleCWebviewEngine extends SystemWebViewEngine {
	public static final String LOG_TAG = "SimpleCWebviewEngine";

	public SimpleCWebviewEngine(Context context, CordovaPreferences preferences) {        
		super(context, preferences);

        Log.d(LOG_TAG, "SimpleCWebviewEngine(context, preferences)");
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        	WebView.enableSlowWholeDocumentDraw();
	        Log.d(LOG_TAG, "enableSlowWholeDocumentDraw()");
        }
	}

	public SimpleCWebviewEngine(SystemWebView webView) {
		super(webView);

        Log.d(LOG_TAG, "SimpleCWebviewEngine(webview)");
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        	WebView.enableSlowWholeDocumentDraw();
	        Log.d(LOG_TAG, "enableSlowWholeDocumentDraw()");
        }
	}
}
