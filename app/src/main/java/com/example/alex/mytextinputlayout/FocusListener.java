package com.example.alex.mytextinputlayout;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Alex on 31/01/2017.
 */

public class FocusListener implements View.OnFocusChangeListener {

    private Context mContext;

    public FocusListener(Context context){
        this.mContext = context;
    }
    private boolean isValidEmail(String email){
        boolean bdev = false;

            //EXPRESIONES REGULARES
        bdev = Patterns.EMAIL_ADDRESS.matcher(email).matches();//Para comprobar si el email coincide, si sigue un patrón
        return bdev;
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {

            Log.e("TAG", "FOCUS CHANGED");

        if(hasFocus){
            Log.e("TAG", "la caja de mail tiene el foco");
        }
        else{

            Log.e("TAG", "la caja de mail ha perdido el foco");
            EditText cajamail = (EditText) v;
            String mailIntroducido = cajamail.getText().toString();
            Log.e("TAG", "Mal intro = " + mailIntroducido);

            if(!isValidEmail(mailIntroducido)){

                Activity a = (Activity) this.mContext;
                TextInputLayout tilmail =  (TextInputLayout) a.findViewById(R.id.tilcaja_mail);
                tilmail.setError("Email Incorrecto");

            }
            else{
                Activity a = (Activity) this.mContext;

                Log.e("TAG", "Mail correcto");
                TextInputLayout tilmail =  (TextInputLayout) a.findViewById(R.id.tilcaja_mail);
                tilmail.setError("");

            }

        }

    }
}
