

package com.mika.mikapornapp20180927175156.ui;

import android.os.Bundle;

import com.mika.mikapornapp20180927175156.R;

import java.util.ArrayList;
import java.util.List;

import buildup.MenuItem;

import buildup.actions.StartActivityAction;
import buildup.util.Constants;

/**
 * MenuAllPornFragment menu fragment.
 */
public class MenuAllPornFragment extends buildup.ui.MenuFragment {
    /**
     * Default constructor
     */
    public MenuAllPornFragment(){
        super();
    }

    // Factory method
    public static MenuAllPornFragment newInstance(Bundle args) {
        MenuAllPornFragment fragment = new MenuAllPornFragment();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Menu Fragment interface
    @Override
    public List<MenuItem> getMenuItems() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        items.add(new MenuItem()
            .setLabel("Partie PHOTO")
            .setIcon(R.drawable.png_defaultmenuicon)
            .setAction(new StartActivityAction(PartiePHOTOActivity.class, Constants.DETAIL))
        );
        return items;
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_list;
    }

    @Override
    public int getItemLayout() {
        return R.layout.menuallporn_item;
    }
}
