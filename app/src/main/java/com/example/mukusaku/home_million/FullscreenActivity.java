package com.example.mukusaku.home_million;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen2);
    }

    // ボタンクリック時の処理
    public void showApps(View v) {
        Intent i = new Intent(FullscreenActivity.this, AppsListActivity.class);
        startActivity(i);
    }

}
