package com.manhnv.push;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ie.imobile.extremepush.*;

public class MainActivity extends Activity {
    private static final String GOOGLE_PROJECT_NUMBER = "588819435791";
    private static final String XTREME_PUSH_APP_KEY = "ztufyVm-UZxOdIyq5O1dnDyh-8QisBq8";
    private PushConnector mPushConnector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // INITIALISE THE XTREMEPUSH CONNECTOR HERE
        mPushConnector = new PushConnector.Builder(XTREME_PUSH_APP_KEY, GOOGLE_PROJECT_NUMBER)
                .create(this);
        mPushConnector.setShowAlertDialog(true);
    /* OPTIONAL USAGE -- IF  USING LOCATION USE THIS VERSION WITH .setEnableLocations(true)
    mPushConnector = new PushConnector.Builder("XTREME_PUSH_APP_KEY", "GOOGLE_PROJECT_NUMBER")
    .setEnableLocations(true)
    .create(this);
    */
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//XtremePush onActivityResult Callback
        mPushConnector.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        //XtremePush onNewIntent Callback
        mPushConnector.onNewIntent(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //XtremePush onStart Callback
        mPushConnector.onStart(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //XtremePush onResume Callback
        mPushConnector.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //XtremePush onPause Callback
        mPushConnector.onPause(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //XtremePush onStop Callback
        mPushConnector.onStop(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //XtremePush onDestroy Callback
        mPushConnector.onDestroy(this);
    }
}
