package com.example.tonio337.uandnano337;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * First way of making button actors
     * @param view

    public void spotifyButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_spotify,Toast.LENGTH_LONG).show();
    }

    public void scoresButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_scores,Toast.LENGTH_LONG).show();
    }

    public void libraryButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_library,Toast.LENGTH_LONG).show();
    }

    public void buildItButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_build_it,Toast.LENGTH_LONG).show();
    }

    public void xyzButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_xyz,Toast.LENGTH_LONG).show();
    }

    public void capstoneButtonClicked(View view)
    {
        Toast.makeText(getApplicationContext(),R.string.title_capstone,Toast.LENGTH_LONG).show();
        if (view.getId()==R.id.button_capstone)
            {}
        else {}
    }
    **/

    /**
     * Second way of making button actors
     * @param view
     */
    public void buttonClickedMakeToast(View view)
    {
        int title;
        switch (view.getId()){
            case R.id.button_spotify:
                title = R.string.title_spotify;
                break;
            case R.id.button_scores:
                title = R.string.title_scores;
                break;
            case R.id.button_library:
                title = R.string.title_library;
                break;
            case R.id.button_build_it:
                title = R.string.title_build_it;
                break;
            case R.id.button_xyz:
                title = R.string.title_xyz;
                break;
            case R.id.button_capstone:
                title = R.string.title_capstone;
                break;
            default:
                return;
        }
        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
    }
}
