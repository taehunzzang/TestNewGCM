package com.zzang.taehun.testnewgcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by taehun on 2015-07-07.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {
    @Override
    public void onTokenRefresh() {
//        super.onTokenRefresh();
        Intent intent = new Intent(this,RegistrationIntentService.class);
        startService(intent);
    }
}
