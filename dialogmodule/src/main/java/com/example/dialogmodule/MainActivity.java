package com.example.dialogmodule;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtndialog;
    private Button mBtnitemdialog;
    private Button mBtnsingledialo;
    private Button mBtnshowtext;
    private int mPosition;
    private Button mBtnMulDialog;
    private Button mBtnCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtndialog = (Button) findViewById(R.id.btn_dialog);
        mBtndialog.setOnClickListener(this);
        mBtnitemdialog = (Button) findViewById(R.id.btn_itemdialog);
        mBtnitemdialog.setOnClickListener(this);
        mBtnsingledialo = (Button) findViewById(R.id.btn_singledialog);
        mBtnsingledialo.setOnClickListener(this);
        mBtnshowtext = (Button) findViewById(R.id.btn_showtext);
        mBtnMulDialog = (Button) findViewById(R.id.btn_muldialog);
        mBtnMulDialog.setOnClickListener(this);
        mBtnCustomDialog = (Button) findViewById(R.id.btn_customdialog);
        mBtnCustomDialog.setOnClickListener(this);
    }

    /**
     *
     * 点击按钮根据ID做出相应的处理
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_dialog:
                show();
                break;
            case R.id.btn_itemdialog:
                showItemDialog();
                break;
            case R.id.btn_singledialog:
                showSingleDialog();
                break;
            case R.id.btn_muldialog:
                showMulDialog();
                break;
            case R.id.btn_customdialog:
                showCustomDialog();
                break;
        }

    }

    /**
     * 提示对话框
     */
    public void show(){
        new AlertDialog.Builder(this)
                .setMessage("确定要退出吗？")
                .setTitle("提示对话框")
                .setIcon(R.drawable.title)
                .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }
    /**
     * 列表对话框
     */
    public void showItemDialog(){
        final String[] str ={"苹果","香蕉","梨","哈密瓜"};
        new AlertDialog.Builder(this)
                .setTitle("列表对话框")
                .setIcon(R.drawable.ic_launcher)
                .setItems(str, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "选择了"+str[which], Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }
    /**
     * 单选对话框
     */
    public void showSingleDialog(){
        final String[] str ={"苹果","香蕉","梨","哈密瓜"};
        new AlertDialog.Builder(this)
                .setTitle("单选对话框")
                .setIcon(R.drawable.ic_launcher)
                .setSingleChoiceItems(str, 2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mPosition = which;
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mBtnshowtext.setText(str[mPosition]);
                    }
                })
                .show();
    }
    /**
     * 多选对话框
     */
    public  void showMulDialog(){
        final String[] str ={"苹果","香蕉","梨","哈密瓜"};
        final boolean[] checkedItem ={false,false,false,false,false};
        new AlertDialog.Builder(this)
                .setTitle("多选对话框")
                .setIcon(R.drawable.ic_launcher)
                .setMultiChoiceItems(str, checkedItem, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkedItem[which] = isChecked;
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String s = "选择了";
                        for (int i = 0; i < checkedItem.length;i++){
                            if (checkedItem[i]){
                                s = s + str[i];
                                mBtnshowtext.setText(s  );
                            }
                        }
                    }
                })
                .show();
    }
    /**
     * 自定义对话框
     */
    public  void showCustomDialog(){
        View view = View.inflate(this,R.layout.dialog_view,null);
        final EditText name = (EditText) view.findViewById(R.id.tv_name);
        final EditText pass = (EditText) view.findViewById(R.id.tv_pass);
        new AlertDialog.Builder(this)
                .setTitle("登录界面")
                .setIcon(R.drawable.ic_launcher)
                .setView(view)
                .setNegativeButton("取消",null)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String username = name.getEditableText().toString();
                        String password = pass.getEditableText().toString();
                        mBtnshowtext.setText("账户是:"+username+"密码:"+password);
                    }

                })
                .show();

    }
}
