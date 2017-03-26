package com.jenniferbusca.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppsFlyerLib.getInstance().startTracking(getApplication(), "mSdcHoqvjvGKFufkp4sM8a");
    }

    public void buttonOnClick(View v) {
        Map<String, Object> eventValue = new HashMap<String, Object>();
        eventValue.put(AFInAppEventParameterName.REVENUE, 200);
        eventValue.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
        eventValue.put(AFInAppEventParameterName.CONTENT_ID, "1234567");
        eventValue.put(AFInAppEventParameterName.CURRENCY, "USD");
        AppsFlyerLib.getInstance().trackEvent(getApplicationContext(), AFInAppEventType.PURCHASE, eventValue);
    }
}
