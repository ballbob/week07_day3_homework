package com.codeclan.listsquids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class SquidListerAdapter extends ArrayAdapter<Squid> {

    public SquidListerAdapter(Context context, ArrayList<Squid> squids){
        super(context,0,squids);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.squid_item, parent, false);
        }

        Squid currentSquid = getItem(position);

        TextView size = (TextView) listItemView.findViewById((R.id.squid_size));
        String sizeText = currentSquid.getSize().toString();
        size.setText(sizeText);

        TextView common_name = (TextView) listItemView.findViewById(R.id.common_name);
        common_name.setText(currentSquid.getCommonName());

        TextView binomial = (TextView) listItemView.findViewById(R.id.binomial);
        binomial.setText(currentSquid.getBinomial());

        return listItemView;
    }
}
