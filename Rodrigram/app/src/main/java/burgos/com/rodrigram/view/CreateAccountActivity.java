package burgos.com.rodrigram.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;
import java.util.Objects;

import burgos.com.rodrigram.R;

public class CreateAccountActivity extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolbar_title_createaccount), true);
    }

    public void showToolbar(String tittle, boolean upButton)
    {
       android.support.v7.widget.Toolbar toolBar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);

            setSupportActionBar(toolBar);

            if(getSupportActionBar() != null) {
                getSupportActionBar().setTitle(tittle);
                getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
            }
    }
}
