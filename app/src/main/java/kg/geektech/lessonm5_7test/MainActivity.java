package kg.geektech.lessonm5_7test;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import kg.geektech.lessonm5_7test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CustomMath math = new CustomMath();
    private Integer num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mathMethod();
    }

    private void mathMethod() {
        mathMethodSub();
        mathMethodDiv();
        mathMethodMul();
        mathMethodAdd();
    }

    private void mathMethodAdd() {
        binding.btnAdd.setOnClickListener(view -> {
            binding.tvResult.setVisibility(View.VISIBLE);
                num1 = Integer.parseInt(binding.etNum1.getText().toString());
                num2 = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.add(num1, num2));
        });
    }
    private void mathMethodMul() {
        binding.btnMult.setOnClickListener(view -> {
            binding.tvResult.setVisibility(View.VISIBLE);
             num1 = Integer.parseInt(binding.etNum1.getText().toString());
             num2 = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(math.multi(num1, num2));
        });
    }
    private void mathMethodDiv() {
        binding.btnDiv.setOnClickListener(view -> {
            binding.tvResult.setVisibility(View.VISIBLE);
             num1 = Integer.parseInt(binding.etNum1.getText().toString());
             num2 = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(math.div(num1, num2));
        });
    }
    private void mathMethodSub() {
        binding.btnSub.setOnClickListener(view -> {
            binding.tvResult.setVisibility(View.VISIBLE);
             num1 = Integer.parseInt(binding.etNum1.getText().toString());
             num2 = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(math.sub(num1, num2));
        });
    }
}