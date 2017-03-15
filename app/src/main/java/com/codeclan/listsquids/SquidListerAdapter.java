package com.codeclan.listsquids;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        Squid currentSquid = getItem(position);

        TextView size = (TextView) listItemView.findViewById((R.id.size));
        size.setText(currentSquid.getSize().toString());

        TextView common_name = (TextView) listItemView.findViewById(R.id.common_name);
        common_name.setText(currentSquid.getCommonName());

        TextView binomial = (TextView) listItemView.findViewById(R.id.binomial);
        binomial.setText(currentSquid.getBinomial());

        return listItemView;
    }
}
