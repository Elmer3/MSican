package chunre.com.msican;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;




public class BlankFragment extends Fragment {

    private VrPanorama imageview;


    public BlankFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        imageview=(VrPanorama) view.fienViewById(R.id.imageview);

        return view;
    }

}
