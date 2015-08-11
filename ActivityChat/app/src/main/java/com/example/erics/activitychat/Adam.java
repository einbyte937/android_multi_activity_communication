package com.example.erics.activitychat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Adam extends Activity {

    private TextView bobMessage; //message from bob
    private EditText adamResponse; //message to bob
    private Button sendToBob;

    /** Called when the activity is first created. */
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adam);

        //initializing GUI Links
        bobMessage = ( TextView ) findViewById( R.id.bobMessage );
        adamResponse = ( EditText ) findViewById( R.id.adamResponse );
        sendToBob = ( Button ) findViewById( R.id.sendToBob );

        //setting up Listener for sendTobob Button
        sendToBob.setOnClickListener( new OnClickListener( ) {
            @Override
            public void onClick( View v ) {
                sendBobTheMessage( );
            }
        });
    }

    private void sendBobTheMessage( ) {
        Intent bob = new Intent( getApplicationContext( ), Bob.class );
        bob.putExtra("adamMessage", adamResponse.getText( ).toString( ));
    }

}
