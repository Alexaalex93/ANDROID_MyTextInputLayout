package com.example.alex.mytextinputlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cajatextoemail = (EditText) findViewById(R.id.caja_mail);
        cajatextoemail.setOnFocusChangeListener(new FocusListener(this)); //ONFOCUSCHANGE SE INVCARÁ TANTO CUANDO ENTRES COMO CUANDO SLAGAS, ESO LO PODRAS CAMBIAR
    }
}
