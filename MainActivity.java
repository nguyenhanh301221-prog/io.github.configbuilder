package io.github.configbuilder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public final class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        TextView view = new TextView(this);
        view.setText("Config Builder");
        view.setTextSize(22);

        setContentView(view);
    }
}