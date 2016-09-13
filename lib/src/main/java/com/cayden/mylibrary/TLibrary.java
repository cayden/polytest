package com.cayden.mylibrary;

import android.util.Log;

/**
 * Created by cuiran
 * Time  16/9/9 17:12
 * Email cuiran2001@163.com
 * Description
 */
public class TLibrary {

    private static String TAG="TLibrary";
    public static TLibrary instance=null;
    private TLibrary(){}

    public static TLibrary getInstance(){
        if(instance==null){
            synchronized (TLibrary.class){
                if(instance==null){
                    instance=new TLibrary();
                }
            }

        }
        return instance;
    }

    public void init(){
        Log.d(TAG,"init");
    }
}


