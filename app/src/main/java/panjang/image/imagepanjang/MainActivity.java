package panjang.image.imagepanjang;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;

import java.io.File;


public class MainActivity extends ActionBarActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        wv = (WebView) findViewById(R.id.wv);
//        wv.loadDataWithBaseURL("file:///android_asset/drawable/", "<img src=\"panjang.jpg\" />", "text/html", "utf-8", null);
//        wv.loadDataWithBaseURL(
//                "file:///android_res/drawable/",
//                "<html><head><style type='text/css'>body, html {\n" +
//                        "height: 100%;\n" +
//                        "width: 100%;\n" +
//                        "margin: 0;\n" +
//                        "padding: 0;\n" +
//                        "background-color: #000000;\n" +
//                        "}\n" +
//                        "img {\n" +
//                        "width: 100%;\n" +
//                        "height: auto;\n" +
//                        "position: absolute;\n" +
//                        "margin: auto;\n" +
//                        "top: 0;\n" +
//                        "left: 0;\n" +
//                        "right: 0;\n" +
//                        "bottom: 0;\n" +
//                        "}</style></head><body><img src=\""
//                        + "panjang.jpg"
//                        + "\"></img></body></html>",
//                "text/html", "utf-8", null);
//        wv.loadDataWithBaseURL(
//                "file:///android_res/drawable/",
//                "<html>" +
//                        "<head>" +
//                        "<style type='text/css'>" +
//                        "body, html" +
//                        "{" +
//                        "height: 100%;" +
//                        "width: 100%;" +
//                        "margin: 0;" +
//                        "padding: 0;" +
//                        "}" +
//                        "img" +
//                        "{" +
//                        "width: 100%;" +
//                        "height: auto;" +
//                        "}" +
//                        "</style>" +
//                        "</head>" +
//                        "<body>" +
//                        "<img src=\"" +
//                        "panjang.jpg"
//                        + "\">" +
//                        "</img>" +
//                        "</body>" +
//                        "</html>",
//                "text/html", "utf-8", null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
