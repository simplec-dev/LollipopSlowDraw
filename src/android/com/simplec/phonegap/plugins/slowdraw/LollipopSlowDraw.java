package com.simplec.phonegap.plugins.slowdraw;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.os.Build;
import android.util.Log;
import android.webkit.WebView;

public class LollipopSlowDraw extends CordovaPlugin {

    private static final String LOG_TAG = "LollipopSlowDraw";


    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    	try {
	        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
	        	WebView.enableSlowWholeDocumentDraw();
		        Log.d(LOG_TAG, "enableSlowWholeDocumentDraw()");
	        }
    	} catch (Exception e) {
	        Log.d(LOG_TAG, e.getMessage());
	        e.printStackTrace();
    	}
    }
}
