package com.rohit.android.activitytofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMessage = findViewById(R.id.editText);


    }

    public void clickHandler(View view) {

        // getting the string from the edittext
        String message = etMessage.getText().toString();

        // Bundle object to send data to fragment as argument
        Bundle arguments = new Bundle();

        // Binding the data with the buncle object
        arguments.putString(SimpleFragment.MESSAGE_KEY, message);

        // SimpleFragment object
        SimpleFragment fragment = new SimpleFragment();

        // Sending the bundle argument with fragment object.
        fragment.setArguments(arguments);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }
}
