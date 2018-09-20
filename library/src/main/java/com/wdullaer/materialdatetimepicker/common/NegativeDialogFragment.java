package com.wdullaer.materialdatetimepicker.common;

import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;

/**
 * Created by taschekj on 11.09.18.
 */
public abstract class NegativeDialogFragment extends DialogFragment {
    protected DialogInterface.OnClickListener mOnNegativeListener;
    protected boolean cancelInvokeNegative = false;
    protected boolean negativeAble = false;

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
        if(this.cancelInvokeNegative){
            negativeAble = true;
        }
    }

    public void setNegativeable(boolean negativeable) {
        negativeAble = negativeable;
    }

    /**
     * Return the current value of {@link #setNegativeable(boolean)}.
     */
    public boolean isNegativeable() {
        return negativeAble;
    }

}
