package com.madchen.hookstudy;

import android.view.View;
import android.widget.Toast;

/**
 * Created by chenwei on 27/02/2017.
 */

public class HookListener implements View.OnClickListener {

    private View.OnClickListener mOriginalListener;

    public HookListener(View.OnClickListener mOriginalListener) {
        this.mOriginalListener = mOriginalListener;
    }

    @Override
    public void onClick(View v) {

        if (mOriginalListener != null) {
            mOriginalListener.onClick(v);
        }
        Object obj = v.getTag(R.id.id_hook);
        if (obj != null && obj instanceof String) {
            Toast.makeText(v.getContext(), (String) obj, Toast.LENGTH_LONG).show();
        }
    }
}
