package j2r.com.guider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.indooratlas.android.sdk.IALocation;
import com.indooratlas.android.sdk.IALocationListener;
import com.indooratlas.android.sdk.IARegion;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements IALocationListener, IARegion.Listener{
    private final String TAG = getLocalClassName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLocationChanged(IALocation location) {
        Log.e(TAG, String.format(Locale.US, "%f,%f, accuracy: %.2f, certainty: %.2f",
                location.getLatitude(), location.getLongitude(), location.getAccuracy(),
                location.getFloorCertainty()));
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onEnterRegion(IARegion iaRegion) {

    }

    @Override
    public void onExitRegion(IARegion iaRegion) {

    }
}
