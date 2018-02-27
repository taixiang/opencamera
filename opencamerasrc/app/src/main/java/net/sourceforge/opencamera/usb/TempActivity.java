package net.sourceforge.opencamera.usb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import net.sourceforge.opencamera.MainActivity;
import net.sourceforge.opencamera.R;

/**
 * @author tx
 * @date 2018/2/27
 */

public class TempActivity extends Activity {

    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TempActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
