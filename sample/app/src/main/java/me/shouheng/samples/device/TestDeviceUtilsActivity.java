package me.shouheng.samples.device;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

import me.shouheng.samples.R;
import me.shouheng.samples.common.BaseActivity;
import me.shouheng.utils.device.DeviceUtils;
import me.shouheng.utils.permission.PermissionUtils;
import me.shouheng.utils.permission.callback.OnGetPermissionCallback;

public class TestDeviceUtilsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_device_utils);

        final TextView tv = findViewById(R.id.tv);

        PermissionUtils.checkPhonePermission(this, new OnGetPermissionCallback() {
            @SuppressLint("MissingPermission")
            @Override
            public void onGetPermission() {
                String sb = "Is Phone : " + DeviceUtils.isPhone() + "\n" +
                        "Device Id : " + DeviceUtils.getDeviceId() + "\n" +
                        "Serial : " + DeviceUtils.getSerial() + "\n" +
                        "IMEI : " + DeviceUtils.getIMEI() + "\n" +
                        "MEID : " + DeviceUtils.getMEID() + "\n" +
                        "IMSI : " + DeviceUtils.getIMSI() + "\n" +
                        "Phone type : " + DeviceUtils.getPhoneType() + "\n" +
                        "Sim Card Ready : " + DeviceUtils.isSimCardReady() + "\n" +
                        "Sim Operator Name : " + DeviceUtils.getSimOperatorName() + "\n" +
                        "Sim Operator By Mnc : " + DeviceUtils.getSimOperatorByMnc() + "\n" +
                        "Phone Status : " + DeviceUtils.getPhoneStatus() + "\n" +
                        "Device Rooted : " + DeviceUtils.isDeviceRooted() + "\n" +
                        "Adb Enabled : " + DeviceUtils.isAdbEnabled() + "\n" +
                        "SDK Version Name : " + DeviceUtils.getSDKVersionName() + "\n" +
                        "SDK Version Code : " + DeviceUtils.getSDKVersionCode() + "\n" +
                        "Android ID : " + DeviceUtils.getAndroidID() + "\n" +
                        "Mac Address : " + DeviceUtils.getMacAddress() + "\n" +
                        "Manufacturer : " + DeviceUtils.getManufacturer() + "\n" +
                        "Model : " + DeviceUtils.getModel() + "\n" +
                        "ABIs : " + Arrays.toString(DeviceUtils.getABIs());
                tv.setText(sb);
            }
        });
    }
}