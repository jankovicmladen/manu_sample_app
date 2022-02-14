package com.example.menusampleapp.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImageView_2_3 extends androidx.appcompat.widget.AppCompatImageView {
    public ImageView_2_3(@NonNull Context context) {
        super(context);
    }

    public ImageView_2_3(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageView_2_3(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = measuredWidth *2/3;

            setMeasuredDimension(measuredWidth, measuredHeight);

    }
}
