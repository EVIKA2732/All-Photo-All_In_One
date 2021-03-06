

package com.mika.mikapornapp20180927175156.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import buildup.ui.BaseDetailActivity;

/**
 * PartiePHOTOActivity detail activity
 */
public class PartiePHOTOActivity extends BaseDetailActivity {

  	@Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        if(isTaskRoot()) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        } else {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected Class<? extends Fragment> getFragmentClass() {
        return PartiePHOTOFragment.class;
    }
}

