package com.daasuu.sample;

import android.text.TextUtils;
import android.util.Patterns;

public class Utills {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}
