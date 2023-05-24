package com.ductho.nguphaptienganh;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class RateApp {

    Context context;

    public RateApp(Context context) {
        this.context = context;
        rate();
    }

    private void rate(){
//        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Uri uri = Uri.parse("market://details?id=com.dts.freefireth&fbclid=IwAR21uaB2aMiTWTcn5t5GGuepv0f8cl8yzXoYKuHeMiXdimDiu36ruQCpADU&pli=1");
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            context.startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
            Uri.parse("https://play.google.com/store/apps/details?id=com.dts.freefireth&fbclid=IwAR21uaB2aMiTWTcn5t5GGuepv0f8cl8yzXoYKuHeMiXdimDiu36ruQCpADU&pli=1")));
        }
    }
}
