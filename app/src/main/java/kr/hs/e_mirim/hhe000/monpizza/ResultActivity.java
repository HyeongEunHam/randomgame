package kr.hs.e_mirim.hhe000.monpizza;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by appcreator00 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult = (TextView) findViewById( R.id.result);
        mResult.setText("결과");
    }
}
