package com.dotplays.textviewaz;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FullActivity extends AppCompatActivity {

    private TextView spannableTextView;
    private String originalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);

        spannableTextView = findViewById(R.id.tvTitle);
        // Get text in TextView object.
        spannableTextView = (TextView) findViewById(R.id.tvTitle);

        originalText = (String) spannableTextView.getText();

        // Set specified text color to red.
        Button btnSetForegroundColor = findViewById(R.id.buttonSetForegroundColor);
        btnSetForegroundColor.setAllCaps(false);
        btnSetForegroundColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
                spannableStr.setSpan(foregroundColorSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Set specified text background color to green.
        Button btnSetBackgroundColor = (Button) findViewById(R.id.buttonSetBackgroundColor);
        btnSetBackgroundColor.setAllCaps(false);
        btnSetBackgroundColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.GREEN);
                spannableStr.setSpan(backgroundColorSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Add under line to specified text.
        Button btnSetUnderLine = (Button) findViewById(R.id.buttonSetUnderLine);
        btnSetUnderLine.setAllCaps(false);
        btnSetUnderLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                UnderlineSpan underlineSpan = new UnderlineSpan();
                spannableStr.setSpan(underlineSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Add strike through line to specified text.
        Button btnSetStrikeThrough = (Button) findViewById(R.id.buttonSetStrikeThrough);
        btnSetStrikeThrough.setAllCaps(false);
        btnSetStrikeThrough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
                spannableStr.setSpan(strikethroughSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Change specified text font size.
        Button btnSetRelativeSize = (Button) findViewById(R.id.buttonSetTextRelativeSize);
        btnSetRelativeSize.setAllCaps(false);
        btnSetRelativeSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);

                RelativeSizeSpan relativeSizeSpan1 = new RelativeSizeSpan(1.2f);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.8f);
                RelativeSizeSpan relativeSizeSpan3 = new RelativeSizeSpan(2.6f);

                spannableStr.setSpan(relativeSizeSpan1, 15, 19, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableStr.setSpan(relativeSizeSpan2, 19, 24, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableStr.setSpan(relativeSizeSpan3, 24, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Change specified text style.
        Button btnSetStyle = (Button) findViewById(R.id.buttonSetStyle);
        btnSetStyle.setAllCaps(false);
        btnSetStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);

                StyleSpan styleSpanBold = new StyleSpan(Typeface.BOLD);
                StyleSpan styleSpanItalic = new StyleSpan(Typeface.ITALIC);

                spannableStr.setSpan(styleSpanBold, 15, 19, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableStr.setSpan(styleSpanItalic, 19, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

                spannableTextView.setText(spannableStr);
            }
        });

        // Change specified text superscript.
        Button btnSetSuperscript = (Button) findViewById(R.id.buttonSetSuperscript);
        btnSetSuperscript.setAllCaps(false);
        btnSetSuperscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                SuperscriptSpan superscriptSpan = new SuperscriptSpan();
                spannableStr.setSpan(superscriptSpan, 15, 16, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Change specified text subscript.
        Button btnSetSubScript = (Button) findViewById(R.id.buttonSetSubscript);
        btnSetSubScript.setAllCaps(false);
        btnSetSubScript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);
                SubscriptSpan subscriptSpan = new SubscriptSpan();
                spannableStr.setSpan(subscriptSpan, 15, 16, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Add images in text.
        Button btnSetSubImage = (Button) findViewById(R.id.buttonSetImage);
        btnSetSubImage.setAllCaps(false);
        btnSetSubImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);

                Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
                drawable.setBounds(0, 0, 100, 100);
                ImageSpan imageSpan = new ImageSpan(drawable);

                spannableStr.setSpan(imageSpan, 15, 19, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableTextView.setText(spannableStr);
            }
        });

        // Add URL in text.
        Button btnSetUrl = (Button) findViewById(R.id.buttonSetUrl);
        btnSetUrl.setAllCaps(false);
        btnSetUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpannableString spannableStr = new SpannableString(originalText);

                URLSpan urlSpan = new URLSpan("http://www.yahoo.com");

                spannableStr.setSpan(urlSpan, 15, 19, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

                spannableTextView.setMovementMethod(LinkMovementMethod.getInstance());
                spannableTextView.setText(spannableStr);
            }
        });


    }
}
