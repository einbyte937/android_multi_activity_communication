package com.example.erics.activitychat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bob extends Activity {
    private TextView adamMessage; //message from bob
    private EditText bobResponse; //message to bob
    private Button sendToAdam;

    /** Called when the activity is first created. */
    @Override
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.bob );


        //initializing GUI Links
        adamMessage= ( TextView ) findViewById( R.id.adamMessage );
        bobResponse= ( EditText ) findViewById( R.id.bobResponse );
        sendToAdam = ( Button ) findViewById( R.id.sendToAdam );

        //setting up Listener for sendToAdam Button
        sendToAdam.setOnClickListener( new OnClickListener( ) {

            @Override
            public void onClick( View v ) {
                sendAdamTheMessage( );

            }
        });


    }

    private void sendAdamTheMessage( ) {
        Intent adam = new Intent( getApplicationContext( ), Adam.class );
        adam.putExtra( "bobMessage", bobResponse.getText( ).toString( ) );
        startActivity( adam );
    }


}
