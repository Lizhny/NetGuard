package eu.faircode.netguard;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * 基类
 * Created by spark on 2016/6/30.
 */
public class ActivityBase extends AppCompatActivity {
    ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mActionBar == null) mActionBar = getSupportActionBar();
    }
}
