package com.dotplays.textviewaz;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private SpannableString spannableString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khai báo nội dung đoạn chữ
        String text = "Click here to open video";

        // khởi tạo đối tượng spannableString với nội dung là biến text
        spannableString = new SpannableString(text);

        // khởi tạo tạo đối tượng là ClickableSpan với sự kiện onClick
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                AlertDialog dlg = new AlertDialog.Builder(MainActivity.this).create();
                dlg.setMessage("You click the text.");
                dlg.show();
            }
        };

        // gán clickableSpan và SpannableString , tham số start và end là vị trí của chữ 'here' trong text, đ
        // tham số cuối chỉ khả dụng với SpannableStringBuilder nên ở đây , chúng ta truyền tùy ý 1 flag, cũng ko ảnh hưởng gì cả
        spannableString.setSpan(clickableSpan, 6, 10, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);

        /*      Spanned.SPAN_INCLUSIVE_EXCLUSIVE ( include start character and exclude end character),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE ( include both start and end character),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE ( exclude both start and end character),
                Spanned.SPAN_EXCLUSIVE_INCLUSIVE ( exclude start character and include end character)*/

        TextView tvText = findViewById(R.id.tvTexts);


        // Lưu ý : cần thêm dòng lệnh này để tắt chức năng chọn và cuộn của textView để sử dụng đc ClickableSpan
        tvText.setMovementMethod(LinkMovementMethod.getInstance());

        tvText.setText(spannableString);


    }

    public void openFull(View view) {
        startActivity(new Intent(this, FullActivity.class));
    }
}
