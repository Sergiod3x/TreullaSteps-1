package treullasteps.com.treullasteps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.lang.Runnable;

import android.os.Handler;

public class Benvenuto1 extends Activity implements Runnable {

    /*static DataBaseHelper myDb;
    //private final static String REGISTRATION_PREFERENCES = "RegPref";
    // private final static String REGISTRATION_DATA = "RegDat";
    //verifico che la registrazione sia già stata effettuata
    //SharedPreferences prefs = getSharedPreferences(REGISTRATION_PREFERENCES, Context.MODE_PRIVATE);
    // boolean a = prefs.getBoolean(REGISTRATION_DATA, true);
    boolean b = true;


    static SharedPreferences sharedFirstTime;
    public static final String MyPREF = "FirstTime";*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benvenuto1);

        /*sharedFirstTime = getSharedPreferences(MyPREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedFirstTime.edit();

        editor.putBoolean("FirstTime", false);
        editor.commit();


        myDb = new DataBaseHelper(this);

        Button bnt = (Button) findViewById(R.id.buttonWelc);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sharedFirstTime.equals(true))
                    startActivity(new Intent(MainActivity.this, Fourth.class));

                startActivity(new Intent(MainActivity.this, Second.class));
            }
        });

        Button dbTest = (Button) findViewById(R.id.dbTest);
        dbTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatabaseTest.class);
                startActivity(intent);
            }
        });

        Handler mHandler = new Handler();
        mHandler.postDelayed(this, 2500);


        myDb = new DataBaseHelper(this);*/


    }


    @Override
    public void run() {
        /*if (b) {    //se la prima registrazione è stata effetuata passo direttamente al contappassi
            Intent intent = new Intent(this, Second.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, CoreActivity.class);
            startActivity(intent);
        }*/
    }


}
