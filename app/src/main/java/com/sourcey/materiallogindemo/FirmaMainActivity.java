package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class FirmaMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firmamain);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
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

    public void openFirmaDKabul(View view) {
        Intent FirmaDKabul = new Intent(getApplicationContext(), FirmaDKabulActivity.class);
        startActivity(FirmaDKabul);
    }


    public void openFirmaSorgulama(View view) {
        Intent FirmaSorgulama = new Intent(getApplicationContext(), FirmaSorgulamaActivity.class);
        startActivity(FirmaSorgulama);
    }

    public void openFirmaDCikis(View view) {
            Intent FirmaDCikis = new Intent(getApplicationContext(), FirmaDCikisActivity.class);
    startActivity(FirmaDCikis);
    }
}
