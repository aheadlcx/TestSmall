package me.aheadlcx.lib.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Description:
 * author: aheadlcx
 * Date:2017/4/28 下午3:11
 */

public class UiTextView extends TextView {
    public UiTextView(Context context) {
        this(context, null);
    }

    public UiTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UiTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }
}
