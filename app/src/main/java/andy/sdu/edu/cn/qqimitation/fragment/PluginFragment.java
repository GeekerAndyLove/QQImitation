package andy.sdu.edu.cn.qqimitation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import andy.sdu.edu.cn.qqimitation.R;

/**
 * Created by Andy.
 * Plugin fragment in main activity. (动态）
 */
public class PluginFragment extends Fragment {


    public PluginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plugin, container, false);
    }

}
