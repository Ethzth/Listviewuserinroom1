package com.example.quocnguyen.customlistviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by quocnguyen on 03/08/2016.
 */
public class CustomListAdapter extends ArrayAdapter<userdetail> {

    ArrayList<userdetail> userdetails;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<userdetail> userdetails) {
        super(context, resource, userdetails);
        this.userdetails = userdetails;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);

        }
        userdetail userdetail = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewUser);
        Picasso.with(context).load(userdetail.getImage()).into(imageView);

        TextView txtName = (TextView) convertView.findViewById(R.id.txtUsername);
        txtName.setText(userdetail.getName());


        return convertView;
    }
}
