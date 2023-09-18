package com.example.year2mission3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent in;

    /**
     * imports and creates a menu in the activity
     * @param menu The options menu in which you place your items.
     *
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * a function that change the backgroung color acording to the selected item
     *
     * @param item The menu item that was selected.
     *
     * @return
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        String st = item.getTitle().toString();
        if (st.equals("Red"))
        {
            setActivityBackgroundColor(Color.RED);
        }
        else if (st.equals("Green"))
        {
            setActivityBackgroundColor(Color.GREEN);
        }
        else if (st.equals("Blue"))
        {
            setActivityBackgroundColor(Color.BLUE);
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * change the background color
     * @param color
     */
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    /**
     * activates the background change
     * @param view
     */
    public void buttonOnClick(View view)
    {
        in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }
}