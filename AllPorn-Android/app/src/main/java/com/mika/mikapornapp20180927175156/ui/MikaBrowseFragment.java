
package com.mika.mikapornapp20180927175156.ui;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.mika.mikapornapp20180927175156.R;
import buildup.ds.Datasource;
import android.widget.ImageView;
import android.widget.TextView;
import buildup.util.image.ImageLoader;
import buildup.util.image.PicassoImageLoader;
import static buildup.util.image.ImageLoaderRequest.Builder.imageLoaderRequest;
import buildup.ds.SearchOptions;
import buildup.ds.filter.Filter;
import java.util.Arrays;
import com.mika.mikapornapp20180927175156.ds.Item;
import com.mika.mikapornapp20180927175156.ds.EmptyDatasource;

public class MikaBrowseFragment extends buildup.ui.DetailFragment<Item>  {

    private Datasource<Item> datasource;
    private SearchOptions searchOptions;

    public static MikaBrowseFragment newInstance(Bundle args){
        MikaBrowseFragment card = new MikaBrowseFragment();
        card.setArguments(args);

        return card;
    }

    public MikaBrowseFragment(){
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchOptions = SearchOptions.Builder.searchOptions().build();
    }

    @Override
    public Datasource getDatasource() {
        if (datasource != null) {
            return datasource;
        }
        datasource = EmptyDatasource.getInstance(searchOptions);
        return datasource;
    }

    // Bindings

    @Override
    protected int getLayout() {
        return R.layout.mikabrowse_custom;
    }

    @Override
    @SuppressLint("WrongViewCast")
    public void bindView(final Item item, View view) {
        
        ImageView view1 = (ImageView) view.findViewById(R.id.view1);
        ImageLoader view1Loader = new PicassoImageLoader(view.getContext());
        view1Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.png_sexy828)
                        .withTargetView(view1)
                        .build()
        );
        
        
        
        ImageView view2 = (ImageView) view.findViewById(R.id.view2);
        ImageLoader view2Loader = new PicassoImageLoader(view.getContext());
        view2Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_3780362286965421990566556)
                        .withTargetView(view2)
                        .build()
        );
        
        
    }

    @Override
    protected void onShow(Item item) {
        // set the title for this fragment
        getActivity().setTitle("MikaBrowse");
    }
}
