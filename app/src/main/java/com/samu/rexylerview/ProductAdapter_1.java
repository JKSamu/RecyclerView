package com.samu.rexylerview;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//public class ProductAdapter_1 {

//--2-EXTENT AFTER CREATE  ProductViewHolderownmake  CLASS WITH EXTENT VH
/*


public class ProductAdapter_1 extends RecyclerView.Adapter<ProductAdapter_1.ProductViewHolderownmake>{

    //---------------------0------------
//this context we will use to inflate the layout
private Context mCtx;

//we are storing all the products1 in a list
private List<Product1> product1List;

public ProductAdapter_1(Context mCtx, List<Product1> product1List) {
    this.mCtx = mCtx;
    this.product1List = product1List;
}

//--------------------0----------------


@NonNull
//----------------------------3-----------------------------viewGroup---is here---parent--- int i is viewType
@Override
public ProductViewHolderownmake onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    //inflating and returning our view holder
  LayoutInflater inflater = LayoutInflater.from(mCtx);
    View view = inflater.inflate(R.layout.products1, null);

    //--or--


   //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.products1, null, false);


    return new ProductViewHolderownmake(view);   // vh class object create with view reffer



    //return null;
}

// --------------3----------------

@Override
public void onBindViewHolder(@NonNull ProductViewHolderownmake productViewHolderownmake, int i) {

//---------------------task-5

    //getting the product1 of the specified position
    Product1 product1 = product1List.get(i);  //position

    //binding the data with the viewholder views
    productViewHolderownmake.textViewTitle.setText(product1.getTitle());
    productViewHolderownmake.textViewShortDesc.setText(product1.getShortdesc());
    productViewHolderownmake.textViewRating.setText(String.valueOf(product1.getRating()));
    productViewHolderownmake.textViewPrice.setText(String.valueOf(product1.getPrice()));

    productViewHolderownmake.imageView.setImageDrawable(mCtx.getResources().getDrawable(product1.getImage()));

//---------------------task-5






}

@Override
public int getItemCount() {
    //return 0;
    //-----------task-6
    return product1List.size();


}

//-----------------1-------------

class ProductViewHolderownmake  extends RecyclerView.ViewHolder
{

    //---------------------------4task--
    TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
    ImageView imageView;


    public ProductViewHolderownmake( View itemView) {
        super(itemView);
//---------------------------4task--4.1
        textViewTitle = itemView.findViewById(R.id.textViewTitle);
        textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
        textViewRating = itemView.findViewById(R.id.textViewRating);
        textViewPrice = itemView.findViewById(R.id.textViewPrice);
        imageView = itemView.findViewById(R.id.imageView);

        // ----------------------4.1



    }
}


//-----------------1-------------


}
*/


/*

public class ProductAdapter_1  extends RecyclerView.Adapter<ProductAdapter_1.ProductViewHolderownmake> {


    public ProductAdapter_1(Context mCtx, List<Product1> product1List) {
        this.mCtx = mCtx;
        this.product1List = product1List;
    }

    //---------------------0------------
//this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products1 in a list
    private List<Product1> product1List;

    @NonNull
    @Override
    public ProductViewHolderownmake onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        //inflating and returning our view holder
        LayoutInflater  inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.products1, null);

        //--or--


        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.products1, null, false);



        return new ProductViewHolderownmake(view);   // vh class object create with view reffer



        //return null;

    }




    @Override
    public void onBindViewHolder(@NonNull ProductViewHolderownmake productViewHolderownmake, int i) {

        //getting the product1 of the specified position
        Product1 product1 = product1List.get(i);  //position

        //binding the data with the viewholder views
        productViewHolderownmake.textViewTitle.setText(product1.getTitle());
        productViewHolderownmake.textViewShortDesc.setText(product1.getShortdesc());
        productViewHolderownmake.textViewRating.setText(String.valueOf(product1.getRating()));
        productViewHolderownmake.textViewPrice.setText(String.valueOf(product1.getPrice()));

        productViewHolderownmake.imageView.setImageDrawable(mCtx.getResources().getDrawable(product1.getImage()));



    }



    @Override
    public int getItemCount() {
        return product1List.size();
    }


    //------------ProductViewHolderownmake---------
    class ProductViewHolderownmake extends RecyclerView.ViewHolder{

    //---------------------------4task--
    TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
    ImageView imageView;
        public ProductViewHolderownmake(@NonNull View itemView) {
            super(itemView);


            //---------------------------4task--4.1
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

            // ----------------------4.1
        }


    }

    //------------ProductViewHolderownmake---------


}*/



//---------------------------------


public class ProductAdapter_1 extends RecyclerView.Adapter<ProductAdapter_1.ProductViewHolderownmake> {

    public ProductAdapter_1(Context mCtx, List<Product1> product1List) {
        this.mCtx = mCtx;
        this.product1List = product1List;
    }

    //---------------------0------------
//this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products1 in a list
    private List<Product1> product1List;

    @NonNull
    @Override
    public ProductViewHolderownmake onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        //inflating and returning our view holder
        LayoutInflater  inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.products1, null);

        //--or--


        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.products1, null, false);



        return new ProductViewHolderownmake(view);   // vh class object create with view reffer





    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolderownmake productViewHolderownmake, int i) {

        //getting the product1 of the specified position
        Product1 product1 = product1List.get(i);  //position

        //binding the data with the viewholder views
        productViewHolderownmake.textViewTitle.setText(product1.getTitle());
        productViewHolderownmake.textViewShortDesc.setText(product1.getShortdesc());
        productViewHolderownmake.textViewRating.setText(String.valueOf(product1.getRating()));
        productViewHolderownmake.textViewPrice.setText(String.valueOf(product1.getPrice()));

        productViewHolderownmake.imageView.setImageDrawable(mCtx.getResources().getDrawable(product1.getImage()));




    }

    @Override
    public int getItemCount() {
        return product1List.size();
    }


    //------------ProductViewHolderownmake---------
    class ProductViewHolderownmake extends RecyclerView.ViewHolder{

        //---------------------------4task--
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;


        public ProductViewHolderownmake(@NonNull View itemView) {
            super(itemView);


            //---------------------------4task--4.1
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

            // ----------------------4.1
        }


    }

    //------------ProductViewHolderownmake---------


}







