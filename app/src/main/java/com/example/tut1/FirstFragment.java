package com.example.tut1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tut1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {


    TextView showCountTextView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View fragmentFirstLayout = inflater.inflate(R.layout.fragment_first, container, false);
        // Get the count text view
        showCountTextView = fragmentFirstLayout.findViewById(R.id.textview_first);

        return fragmentFirstLayout;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.count_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(view);
            }
        });

        view.findViewById(R.id.toast_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity(), "Hello Toast!", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

    }

    private void countMe(View view) {
        // Get the value to a number and increment it
        String countString = showCountTextView.getText().toString();

        // Convert value to a number an increment it
        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the text view
        showCountTextView.setText(count.toString());
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}