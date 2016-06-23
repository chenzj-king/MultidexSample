package cn.chenzhongjin.multidexsample;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * @author chenzj
 * @Title: AppContext
 * @Description: 类的描述 -
 * @date 2016/6/23 12:59
 * @email admin@chenzhongjin.cn
 */
public class AppContext extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

