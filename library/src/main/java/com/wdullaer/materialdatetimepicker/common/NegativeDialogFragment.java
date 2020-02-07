package com.wdullaer.materialdatetimepicker.common;

import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;

/**
 * Created by taschekj on 11.09.18.
 */
public abstract class NegativeDialogFragment extends DialogFragment {
    protected static final String KEY_AUTO_DISMISS = "auto_dismiss";
    protected DialogInterface.OnClickListener mOnNegativeListener;
    protected boolean cancelInvokeNegative = false;
    protected boolean negativeAble = false;
    protected boolean hideOkButton = false;
    protected boolean mAutoDismiss = false;

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

    /**
     *
     * @param hideOkButton
     */
    public void setHideOkButton(boolean hideOkButton){
        this.hideOkButton = hideOkButton;
    }

    /**
     * Return the current value of {@link #setHideOkButton(boolean)}.
     */
    public boolean shouldHideOkButton(){
        return hideOkButton;
    }

    /**
     * Set whether the picker should dismiss itself when a day or full time is selected
     *
     * @param autoDismiss true if the dialog should dismiss itself when a day or full time is selected
     */
    @SuppressWarnings("unused")
    public void autoDismiss(boolean autoDismiss) {
        mAutoDismiss = autoDismiss;
    }

}
