
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getLegionVersion(){
        String buildType = SystemProperties.get("ro.legionversion","");
	return buildType.equals("") ? "" : buildType;
    }
}
