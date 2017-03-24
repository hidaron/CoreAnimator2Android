package demo.org.limlee.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demo.org.limlee.demo.gift.HuijiGiftAnimatorView;

public class MainActivity extends AppCompatActivity {

    private HuijiGiftAnimatorView mHuijiGiftAnimatorView;
    private Button mPlayBtn;
    private Button mStopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHuijiGiftAnimatorView = (HuijiGiftAnimatorView) findViewById(R.id.huiji);
        mPlayBtn = (Button) findViewById(R.id.play);
        mStopBtn = (Button) findViewById(R.id.stop);
        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHuijiGiftAnimatorView.play();
            }
        });
        mStopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHuijiGiftAnimatorView.stop();
            }
        });
    }
}
