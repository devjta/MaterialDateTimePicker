package com.wdullaer.materialdatetimepicker.common;

import android.app.DialogFragment;
import android.content.DialogInterface;

/**
 * Created by taschekj on 11.09.18.
 */
public abstract class NegativeDialogFragment extends DialogFragment {
    protected DialogInterface.OnClickListener mOnNegativeListener;
    protected boolean cancelInvokeNegative = false;

    public void notifyNegativeListener(){
        if(mOnNegativeListener != null){
            mOnNegativeListener.onClick(getDialog(), -1);
        }
    }

    public void setOnNegativeListener(DialogInterface.OnClickListener onClickListener) {
        mOnNegativeListener = onClickListener;
        setCancelButtonToNegative(mOnNegativeListener != null);
    }

    public void setCancelButtonToNegative(boolean aValue){
        this.cancelInvokeNegative = aValue;
    }
}
