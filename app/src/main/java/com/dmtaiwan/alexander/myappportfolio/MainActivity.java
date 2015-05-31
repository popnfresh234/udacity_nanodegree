package com.dmtaiwan.alexander.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button mSpotifyButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBuildButton;
    private Button mXyzButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyButton = (Button) findViewById(R.id.button_spotify);
        mScoresButton = (Button) findViewById(R.id.button_scores);
        mLibraryButton = (Button) findViewById(R.id.button_library);
        mBuildButton = (Button) findViewById(R.id.button_build);
        mXyzButton = (Button) findViewById(R.id.button_xyz);
        mCapstoneButton = (Button) findViewById(R.id.button_capstone);

        mSpotifyButton.setOnClickListener(this);
        mScoresButton.setOnClickListener(this);
        mLibraryButton.setOnClickListener(this);
        mBuildButton.setOnClickListener(this);
        mXyzButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button_spotify:
                makeToast(getString(R.string.toast_spotify));
                break;

            case R.id.button_scores:
                makeToast(getString(R.string.toast_scores));
                break;

            case R.id.button_library:
                makeToast(getString(R.string.toast_library));
                break;

            case R.id.button_build:
                makeToast(getString(R.string.toast_build));
                break;

            case R.id.button_xyz:
                makeToast(getString(R.string.toast_xyz));
                break;

            case R.id.button_capstone:
                makeToast(getString(R.string.toast_capstone));
                break;
        }
    }

    private void makeToast(String toastText) {
        Toast.makeText(this, getString(R.string.toast_pretext) + toastText, Toast.LENGTH_LONG).show();
    }
}
