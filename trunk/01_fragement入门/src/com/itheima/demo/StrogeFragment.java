package com.itheima.demo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StrogeFragment extends Fragment {
	//���ص�ǰfragment��ʾ������
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.stroge, null);
		}
}
