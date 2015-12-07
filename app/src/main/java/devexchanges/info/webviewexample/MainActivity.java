package devexchanges.info.webviewexample;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.web_view);
        //String htmlString = "<html><body><h1>Hello, This is a simple WebView</h1>" +
         //       "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
           //     "<p>This is a sample paragraph.</p>" +
             //   "</body></html>";
        //webView.loadData(htmlString, "text/html", "UTF-8");

        webView.setWebViewClient(new CustomWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.devexchanges.info/");
    }

    private class CustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
