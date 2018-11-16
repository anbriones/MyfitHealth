package com.example.ana.myfithealth;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class Perfil extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.perfil, container, false);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.joven:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.adulto:
                if (checked)
                    // Ninjas rule
                    break;

            case R.id.mayor:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

}