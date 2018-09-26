package burgos.com.rodrigram.view;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import burgos.com.rodrigram.R;

public class PictureDetailActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_detail);
        showToolbar("",true);
    }
    public void showToolbar(String tittle, boolean upButton)
    {
        android.support.v7.widget.Toolbar toolBar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolBar);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(tittle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
        }

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);

    }
}