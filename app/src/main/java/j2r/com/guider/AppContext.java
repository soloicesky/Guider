package j2r.com.guider;

import android.app.Application;

import com.wilddog.client.Wilddog;

/**
 * Created by Mark on 2017/10/14.
 */

public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Wilddog.setAndroidContext(this);
    }

}
