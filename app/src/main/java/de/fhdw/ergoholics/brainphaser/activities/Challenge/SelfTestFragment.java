package de.fhdw.ergoholics.brainphaser.activities.Challenge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.fhdw.ergoholics.brainphaser.BrainPhaserComponent;
import de.fhdw.ergoholics.brainphaser.R;

/**
 * Created by Chris on 3/10/2016.
 */
public class SelfTestFragment extends AnswerFragment {
    View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_challenge_text, container, false);
        return mView;
    }

    @Override
    public boolean checkAnswers() {
        return false;
    }

    @Override
    protected void injectComponent(BrainPhaserComponent component) {
        component.inject(this);
    }
}
