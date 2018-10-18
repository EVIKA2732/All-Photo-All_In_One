

package com.mika.mikapornapp20180927175156.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.mika.mikapornapp20180927175156.R;

import buildup.ui.BaseListingActivity;
/**
 * MenuAllPornActivity list activity
 */
public class MenuAllPornActivity extends BaseListingActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        if(isTaskRoot()) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        } else {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        
        setTitle(getString(R.string.menuAllPornActivity));
    }

    @Override
    protected Class<? extends Fragment> getFragmentClass() {
        return MenuAllPornFragment.class;
    }

}
