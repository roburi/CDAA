package burgos.com.rodrigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import burgos.com.rodrigram.view.ContainerActivity;
import burgos.com.rodrigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity
{

    private Intent intent;
    private Intent intentContainer;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view)
    {
        intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goContainer(View view)
    {
        intentContainer = new Intent(getApplicationContext(), ContainerActivity.class);
        startActivity(intentContainer);
    }
    public void goPlatziGram(View view)
    {
        intentContainer = new Intent(getApplicationContext(), ContainerActivity.class);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.platzi.com")));
    }
}