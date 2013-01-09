package com.alarm.alarm;

import android.text.format.Time;


public class SetTime {

	public SetTime() {}

	public Time getTime() {

		Time currentTime = new Time();
		currentTime.setToNow();
		return currentTime;
	}
}
