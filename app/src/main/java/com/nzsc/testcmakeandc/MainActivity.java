package com.nzsc.testcmakeandc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nzsc.testcmakeandc.Serial.NeativeSerial;

public class MainActivity extends AppCompatActivity {
NeativeSerial serial=new NeativeSerial();
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(serial.stringFromJNI());
    }

}
