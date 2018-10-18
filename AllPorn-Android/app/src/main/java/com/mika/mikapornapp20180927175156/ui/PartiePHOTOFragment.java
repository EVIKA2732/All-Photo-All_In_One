
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

public class PartiePHOTOFragment extends buildup.ui.DetailFragment<Item>  {

    private Datasource<Item> datasource;
    private SearchOptions searchOptions;

    public static PartiePHOTOFragment newInstance(Bundle args){
        PartiePHOTOFragment card = new PartiePHOTOFragment();
        card.setArguments(args);

        return card;
    }

    public PartiePHOTOFragment(){
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
        return R.layout.partiephoto_custom;
    }

    @Override
    @SuppressLint("WrongViewCast")
    public void bindView(final Item item, View view) {
        
        ImageView view0 = (ImageView) view.findViewById(R.id.view0);
        ImageLoader view0Loader = new PicassoImageLoader(view.getContext());
        view0Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_3f49c353a1b37788f7b241308)
                        .withTargetView(view0)
                        .build()
        );
        
        
        
        ImageView view1 = (ImageView) view.findViewById(R.id.view1);
        ImageLoader view1Loader = new PicassoImageLoader(view.getContext());
        view1Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_5bc698bd0035c11274ac93aa8)
                        .withTargetView(view1)
                        .build()
        );
        
        
        
        ImageView view2 = (ImageView) view.findViewById(R.id.view2);
        ImageLoader view2Loader = new PicassoImageLoader(view.getContext());
        view2Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_7a4286eb29c5510e698cd616f)
                        .withTargetView(view2)
                        .build()
        );
        
        
        
        ImageView view3 = (ImageView) view.findViewById(R.id.view3);
        ImageLoader view3Loader = new PicassoImageLoader(view.getContext());
        view3Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_95a9d57a33345d5f4e059587d)
                        .withTargetView(view3)
                        .build()
        );
        
        
        
        ImageView view4 = (ImageView) view.findViewById(R.id.view4);
        ImageLoader view4Loader = new PicassoImageLoader(view.getContext());
        view4Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_962a7e7fe10e0af4fdd479c86)
                        .withTargetView(view4)
                        .build()
        );
        
        
        
        ImageView view5 = (ImageView) view.findViewById(R.id.view5);
        ImageLoader view5Loader = new PicassoImageLoader(view.getContext());
        view5Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_88841ab14b8a069ed13aec09a)
                        .withTargetView(view5)
                        .build()
        );
        
        
        
        ImageView view6 = (ImageView) view.findViewById(R.id.view6);
        ImageLoader view6Loader = new PicassoImageLoader(view.getContext());
        view6Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_01421)
                        .withTargetView(view6)
                        .build()
        );
        
        
        
        ImageView view7 = (ImageView) view.findViewById(R.id.view7);
        ImageLoader view7Loader = new PicassoImageLoader(view.getContext());
        view7Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_4ec96cde26356b757a965692e)
                        .withTargetView(view7)
                        .build()
        );
        
        
        
        ImageView view8 = (ImageView) view.findViewById(R.id.view8);
        ImageLoader view8Loader = new PicassoImageLoader(view.getContext());
        view8Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_32eb061c5b646ce7e4d2edbd0)
                        .withTargetView(view8)
                        .build()
        );
        
        
        
        ImageView view9 = (ImageView) view.findViewById(R.id.view9);
        ImageLoader view9Loader = new PicassoImageLoader(view.getContext());
        view9Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_collegeteennudes1354)
                        .withTargetView(view9)
                        .build()
        );
        
        
        
        ImageView view10 = (ImageView) view.findViewById(R.id.view10);
        ImageLoader view10Loader = new PicassoImageLoader(view.getContext());
        view10Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_lusciousnetlusciousnet482)
                        .withTargetView(view10)
                        .build()
        );
        
        
        
        ImageView view11 = (ImageView) view.findViewById(R.id.view11);
        ImageLoader view11Loader = new PicassoImageLoader(view.getContext());
        view11Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.jpg_photoamateurbigtitsblonde)
                        .withTargetView(view11)
                        .build()
        );
        
        
        
        ImageView view12 = (ImageView) view.findViewById(R.id.view12);
        ImageLoader view12Loader = new PicassoImageLoader(view.getContext());
        view12Loader.load(imageLoaderRequest()
                        .withResourceToLoad(R.drawable.png_defaultmenuicon)
                        .withTargetView(view12)
                        .build()
        );
        
        
    }

    @Override
    protected void onShow(Item item) {
        // set the title for this fragment
        getActivity().setTitle("Partie PHOTO");
    }
}
