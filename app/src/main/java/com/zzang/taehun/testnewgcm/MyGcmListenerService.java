package com.zzang.taehun.testnewgcm;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by taehun on 2015-07-07.
 */
public class MyGcmListenerService extends GcmListenerService {
    @Override
    public void onMessageReceived(String from, Bundle data) {
        super.onMessageReceived(from, data);
        try{
            Log.e("from","from : "+data.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
