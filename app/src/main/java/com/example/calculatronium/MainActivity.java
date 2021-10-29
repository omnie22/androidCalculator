package com.example.calculatronium;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.calculatronium.databinding.CalcViewBinding;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalcViewBinding binding = CalcViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AtomicBoolean Operator = new AtomicBoolean(false);
        AtomicBoolean Decimal = new AtomicBoolean(false);
        //Jimmy was doing something similar to me so he helped me out
        //number button onclicks
        Button btn1 = binding.btn1;
        btn1.setOnClickListener(v -> {
            binding.calcTextView.append("1");
        });
        //BEHOLD THE ULTIMATE POWER OF MY SPAGHETTI (I hate this as much as you do I promise)
        Button btn2 = binding.btn2;
        btn2.setOnClickListener(v -> {
            binding.calcTextView.append("2");
        });
        Button btn3 = binding.btn3;
        btn3.setOnClickListener(v -> {
            binding.calcTextView.append("3");
        });
        Button btn4 = binding.btn4;
        btn4.setOnClickListener(v -> {
            binding.calcTextView.append("4");
        });
        Button btn5 = binding.btn5;
        btn5.setOnClickListener(v -> {
            binding.calcTextView.append("5");
        });
        Button btn6 = binding.btn6;
        btn6.setOnClickListener(v -> {
            binding.calcTextView.append("6");
        });
        Button btn7 = binding.btn7;
        btn7.setOnClickListener(v -> {
            binding.calcTextView.append("7");
        });
        Button btn8 = binding.btn8;
        btn8.setOnClickListener(v -> {
            binding.calcTextView.append("8");
        });
        Button btn9 = binding.btn9;
        btn9.setOnClickListener(v -> {
            binding.calcTextView.append("9");
        });
        Button btn0 = binding.btn0;
        btn0.setOnClickListener(v -> {
            binding.calcTextView.append("0");
        });
        //operator button onclicks
        Button btnPlus = binding.btnPlus;
        btnPlus.setOnClickListener(v -> {
            if (!Operator.get()){
                Operator.set(true);
                Decimal.set(false);
                binding.calcTextView.append(" + ");
            }
        });
        Button btnMinus = binding.btnMinus;
        btnMinus.setOnClickListener(v -> {
            if (!Operator.get()) {
                Operator.set(true);
                Decimal.set(false);
                binding.calcTextView.append(" - ");
            }
        });
        Button btnMultiply = binding.btnMultiply;
        btnMinus.setOnClickListener(v -> {
            if (!Operator.get()) {
                Operator.set(true);
                Decimal.set(false);
                binding.calcTextView.append(" * ");
            }
        });
        Button btnDivide = binding.btnDivide;
        btnDivide.setOnClickListener(v -> {
            if (!Operator.get()) {
                Operator.set(true);
                Decimal.set(false);
                binding.calcTextView.append(" / ");
            }
        });
        Button btnDecimal = binding.btnDecimal;
        btnDecimal.setOnClickListener(v -> {
            if (!Decimal.get()) {
                Decimal.set(true);
                binding.calcTextView.append(".");
            }
        });
        Button btnC = binding.btnC;
        btnC.setOnClickListener(v -> {
            binding.calcTextView.setText("");
            Operator.set(false);
            Decimal.set(false);
        });
    }
}