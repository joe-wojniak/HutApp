package blog.globalquality.hutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the nextPage button is clicked
     */
    public void nextPage(View view) {
        Log.i("nextPage", "page= " + page);
        if (page == 1) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.hut);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.genInfo);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.questions);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.title_JennyCreek);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.AxsJCrk);

            page = page + 1;
            Log.i("nextPage", "page=1+1= " + page);
        }
        if (page == 2) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_LostLake);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.AxsLake);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.Calendar);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.title_WoodStove);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.AmenitiesWoodStove);

            page = page + 1;
            Log.i("nextPage", "page=2+1= " + page);
        } else if (page == 3) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_Water);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.AmenitiesWater);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.title_SolarPanel);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.SolarPanel);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.SolarPanel2);

            page = page + 1;
            Log.i("nextPage", "page=3+1= " + page);
        } else if (page == 4) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_Outhouse);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.Outhouse);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.title_Rules);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.Rules);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.title_FS + " " + R.string.FS_Permit);

            page = page + 1;
            Log.i("nextPage", "page=4+1= " + page);
        } else if (page == 5) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_FS);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.FS_Permit2);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.title_Snow);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.Snow_WeatherReportsDayUse);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.title_DayTrip + " " + R.string.DayTrips);

            page = page + 1;
            Log.i("nextPage", "page=5+1= " + page);
        } else if (page == 6) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_Backcountry);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.BackcountryUse);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.title_Emergencies);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.Emergencies);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(R.string.title_CD + " " + R.string.ContinentalDivide);

            page = page + 1;
            Log.i("nextPage", "page=6+1= " + page);
        } else if (page == 7) {
            ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
            sv.scrollTo(0, 0);

            TextView textElement = (TextView) findViewById(R.id.title);
            textElement.setText(R.string.title_Dogs);

            textElement = (TextView) findViewById(R.id.textView1);
            textElement.setText(R.string.Dogs);

            textElement = (TextView) findViewById(R.id.textView2);
            textElement.setText(R.string.title_LostFound);

            textElement = (TextView) findViewById(R.id.textView3);
            textElement.setText(R.string.LostFoundAndEvents);

            textElement = (TextView) findViewById(R.id.textView4);
            textElement.setText(" ");

            page = 1;
            Log.i("nextPage", "page= 1 = " + page);
        }
        else {
            page = 1;
        }
    }

    /**
     * This method is called when User wants to send an email
     */
    //public void sendEmail(View view) {
    // Use an intent to launch an email app.
    //  Intent intent = new Intent(Intent.ACTION_SENDTO);
    //  intent.setData(Uri.parse("mailto:")); // only email apps should handle this
    //  intent.putExtra(Intent.EXTRA_SUBJECT,
    //          "Question for Hutmeister");
    //
    //        if (intent.resolveActivity(getPackageManager()) != null) {
    //            startActivity(intent);
    //        }
    //    }

}
