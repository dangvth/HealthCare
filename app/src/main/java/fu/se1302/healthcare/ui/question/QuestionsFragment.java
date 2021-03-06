package fu.se1302.healthcare.ui.question;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fu.se1302.healthcare.R;

public class QuestionsFragment extends Fragment {

    private QuestionsViewModel questionsViewModel;

    public static QuestionsFragment newInstance() {
        return new QuestionsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        questionsViewModel = ViewModelProviders.of(this).get(QuestionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_questions, container, false);
        final TextView textView = root.findViewById(R.id.text_question);
        questionsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
