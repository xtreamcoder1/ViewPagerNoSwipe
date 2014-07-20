package com.xtreamcoder.vp;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPager extends ViewPager {
	private boolean isSwipeEnabled;

	public MyViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.isSwipeEnabled = true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (this.isSwipeEnabled) {
			return super.onTouchEvent(event);
		}
		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		if (this.isSwipeEnabled) {
			return super.onInterceptTouchEvent(event);
		}
		return false;
	}

	/**
	 * Custom method to enable or disable swipe
	 *
	 * @param isSwipeEnabled	true to enable swipe, false otherwise
	 * 
	 */
	 public void setPagingEnabled(boolean isSwipeEnabled) {
		 this.isSwipeEnabled = isSwipeEnabled;
	 }
}