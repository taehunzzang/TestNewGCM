package com.zzang.taehun.testnewgcm;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

/**
 * Created by taehun on 2015-07-07.
 */
public class RegistrationIntentService extends IntentService {
    private static final String TAG = RegistrationIntentService.class.getSimpleName();
    private static final String PROJECT_ID = "800953091294";
    public RegistrationIntentService() {
        super(TAG);
    }
    @Override
    protected void onHandleIntent(Intent intent) {
//        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("registrationGenerating"));
        InstanceID instanceID = InstanceID.getInstance(this);

        String token = "";
        Log.e("", "token : "+token);
        try{
            synchronized(TAG){
                String scope = GoogleCloudMessaging.INSTANCE_ID_SCOPE;
                token = instanceID.getToken(PROJECT_ID,scope,null);
                Log.e("", "token : "+token);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
