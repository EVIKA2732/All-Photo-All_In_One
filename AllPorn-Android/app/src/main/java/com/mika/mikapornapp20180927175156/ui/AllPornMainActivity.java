
package com.mika.mikapornapp20180927175156.ui;

import android.support.v4.app.Fragment;
import android.util.SparseArray;

import buildup.ui.DrawerActivity;

import buildup.actions.StartActivityAction;
import buildup.util.Constants;
import com.mika.mikapornapp20180927175156.R;

public class AllPornMainActivity extends DrawerActivity {

    private final SparseArray<Class<? extends Fragment>> sectionFragments = new SparseArray<>();
    {
            sectionFragments.append(R.id.entry0, MenuAllPornFragment.class);
            sectionFragments.append(R.id.entry1, MikaBrowseFragment.class);
    }

    @Override
    public SparseArray<Class<? extends Fragment>> getSectionFragmentClasses() {
      return sectionFragments;
    }

}
