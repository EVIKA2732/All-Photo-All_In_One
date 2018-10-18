

package com.mika.mikapornapp20180927175156;

import android.app.Application;
import buildup.injectors.ApplicationInjector;
import android.support.multidex.MultiDexApplication;
import buildup.push.BluemixPushWrapper;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.BMSClient;


/**
 * You can use this as a global place to keep application-level resources
 * such as singletons, services, etc.
 */
public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationInjector.setApplicationContext(this);
        BluemixPushWrapper bluemixPushWrapper = new BluemixPushWrapper();
        bluemixPushWrapper.register(this,
            getString(R.string.bmdBluemixRegion),
            getString(R.string.pushAppGuid),
            getString(R.string.pushClientSecret)
        );
    }
}
