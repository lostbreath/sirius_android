package edu.sirius.examples.android.lesson3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by a.halaidzhy on 05.01.2018.
 */

public class SimpleFragment extends Fragment {
    public static final String TAG = SimpleFragment.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final LinearLayout l = (LinearLayout)inflater.inflate(R.layout.simple_fragment, container, false);
        final Button button = (Button)l.findViewById(R.id.show_dialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new SimpleDialogFragment();
                newFragment.show(getActivity().getSupportFragmentManager(), "timePicker");
            }
        });

        return l;
    }
}
