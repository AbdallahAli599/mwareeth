package com.abdallah.mwareeth.calc;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.abdallah.mwareeth.R;
import com.abdallah.mwareeth.databinding.ActivityCalcBinding;

public class CalcActivity extends AppCompatActivity {

    ActivityCalcBinding binding;
    private Waratha waratha = new Waratha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTextViewListeners();
        setButtonsListeners();
    }

    private void setButtonsListeners() {
        binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int i = binding.radioGroup.getCheckedRadioButtonId();

                if (i == R.id.radio1) {
                    binding.husSwitch.setVisibility(View.VISIBLE);
                    binding.wifeTv.setText(R.string.hus_tv);
                    binding.wifeEditText.setVisibility(View.GONE);
                } else {
                    binding.husSwitch.setVisibility(View.GONE);
                    binding.wifeTv.setText(R.string.wife_tv);
                    binding.wifeEditText.setVisibility(View.VISIBLE);
                }
            }
        });

        binding.newQesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAll();
            }
        });

        binding.answerQuesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkFieldsGender();
            }
        });
    }

    private void setTextViewListeners() {
        binding.wifeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.wifeEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.wifeEditText.getText().toString());

                    if (i > 4) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش ملكش غير هو أربعة بس", Toast.LENGTH_SHORT).show();
                        binding.wifeEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcGirlEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcGirlEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcGirlEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcGirlEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcGirlOfSonEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcGirlOfSonEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcGirlOfSonEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcGirlOfSonEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcRealBroEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcRealBroEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcRealBroEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcRealBroEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcBroFromDadEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcBroFromDadEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcBroFromDadEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcBroFromDadEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcBroFromMomEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcBroFromMomEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcBroFromMomEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcBroFromMomEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcRealUncleEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcRealUncleEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcRealUncleEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcRealUncleEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcRealCousinEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcRealCousinEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcRealCousinEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcRealCousinEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcRealSonOfBroEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcRealSonOfBroEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcRealSonOfBroEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcRealSonOfBroEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcSonEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcSonEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcSonEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcSonEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcSonOfSonEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcSonOfSonEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcSonOfSonEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcSonOfSonEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcRealSisEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcRealSisEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcRealSisEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcRealSisEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcSisFromDadEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcSisFromDadEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcSisFromDadEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcSisFromDadEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcSisFromMomEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcSisFromMomEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcSisFromMomEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcSisFromMomEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcSonOfBroFromDadEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcSonOfBroFromDadEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcSonOfBroFromDadEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcSonOfBroFromDadEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcUncleFromDadEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcUncleFromDadEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcUncleFromDadEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcUncleFromDadEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.calcCousinFromDadEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.calcCousinFromDadEditText.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.calcCousinFromDadEditText.getText().toString());

                    if (i > 100) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 100", Toast.LENGTH_SHORT).show();
                        binding.calcCousinFromDadEditText.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.cashEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!binding.cashEt.getText().toString().isEmpty()) {
                    int i = Integer.parseInt(binding.cashEt.getText().toString());

                    if (i > 99999999) {
                        Toast.makeText(CalcActivity.this, "لا يا عم الحج معلش أخرك معايا 99999999 ودا كتير أوي علفكرة", Toast.LENGTH_SHORT).show();
                        binding.cashEt.setText(null);
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void checkFieldsGender() {
        int i = binding.radioGroup.getCheckedRadioButtonId();
        if (i == R.id.radio1) {
            checkFieldsFemale();
        } else {
            checkFieldsMale();
        }
    }

    private void checkFieldsFemale() {
        if (!binding.husSwitch.isChecked() && binding.calcGirlEditText.getText().toString().equals("") && binding.calcGirlOfSonEditText.getText().toString().equals("") &&
                binding.calcRealBroEditText.getText().toString().equals("") && binding.calcBroFromDadEditText.getText().toString().equals("") && binding.calcBroFromMomEditText.getText().toString().equals("") &&
                binding.calcRealUncleEditText.getText().toString().equals("") && binding.calcRealCousinEditText.getText().toString().equals("") && binding.calcRealSonOfBroEditText.getText().toString().equals("") &&
                binding.calcSonEditText.getText().toString().equals("") && binding.calcSonOfSonEditText.getText().toString().equals("") && binding.calcRealSisEditText.getText().toString().equals("") &&
                binding.calcSisFromDadEditText.getText().toString().equals("") && binding.calcSisFromMomEditText.getText().toString().equals("") && binding.calcSonOfBroFromDadEditText.getText().toString().equals("") &&
                binding.calcUncleFromDadEditText.getText().toString().equals("") && binding.calcCousinFromDadEditText.getText().toString().equals("") &&
                !binding.calcGrandDadSwitch.isChecked() && !binding.calcGrandMaSwitch.isChecked() && !binding.calcGrandMomSwitch.isChecked() && !binding.dadSwitch.isChecked() && !binding.momSwitch.isChecked()) {
            openDialog();
        } else {
            collectData();
        }
    }

    private void checkFieldsMale() {
        if (binding.wifeEditText.getText().toString().equals("") && binding.calcGirlEditText.getText().toString().equals("") && binding.calcGirlOfSonEditText.getText().toString().equals("") &&
                binding.calcRealBroEditText.getText().toString().equals("") && binding.calcBroFromDadEditText.getText().toString().equals("") && binding.calcBroFromMomEditText.getText().toString().equals("") &&
                binding.calcRealUncleEditText.getText().toString().equals("") && binding.calcRealCousinEditText.getText().toString().equals("") && binding.calcRealSonOfBroEditText.getText().toString().equals("") &&
                binding.calcSonEditText.getText().toString().equals("") && binding.calcSonOfSonEditText.getText().toString().equals("") && binding.calcRealSisEditText.getText().toString().equals("") &&
                binding.calcSisFromDadEditText.getText().toString().equals("") && binding.calcSisFromMomEditText.getText().toString().equals("") && binding.calcSonOfBroFromDadEditText.getText().toString().equals("") &&
                binding.calcUncleFromDadEditText.getText().toString().equals("") && binding.calcCousinFromDadEditText.getText().toString().equals("") &&
                !binding.calcGrandDadSwitch.isChecked() && !binding.calcGrandMaSwitch.isChecked() && !binding.calcGrandMomSwitch.isChecked() && !binding.dadSwitch.isChecked() && !binding.momSwitch.isChecked()
        ) {
            openDialog();
        } else {
            collectData();
        }
    }

    private void openDialog() {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(), "any");
    }

    private void collectData() {
        if (binding.radioGroup.getCheckedRadioButtonId() == R.id.radio0) {
            if (!binding.wifeEditText.getText().toString().isEmpty()) {
                int wife = Integer.parseInt(binding.wifeEditText.getText().toString());
                waratha.set_azawjat(wife);
            }
        } else
            waratha.set_azawjat(0);

        if (!binding.calcGirlEditText.getText().toString().equals("")) {
            int Girl = Integer.parseInt(binding.calcGirlEditText.getText().toString());
            waratha.set_albanat(Girl);
        } else
            waratha.set_albanat(0);

        if (!binding.calcGirlOfSonEditText.getText().toString().equals("")) {
            int GirlOfSon = Integer.parseInt(binding.calcGirlOfSonEditText.getText().toString());
            waratha.set_banat_alabna(GirlOfSon);
        } else
            waratha.set_banat_alabna(0);

        if (!binding.calcRealBroEditText.getText().toString().equals("")) {
            int RealBro = Integer.parseInt(binding.calcRealBroEditText.getText().toString());
            waratha.set_alikhwa_alashika(RealBro);
        } else
            waratha.set_alikhwa_alashika(0);

        if (!binding.calcBroFromDadEditText.getText().toString().equals("")) {
            int BroFromDad = Integer.parseInt(binding.calcBroFromDadEditText.getText().toString());
            waratha.set_alikhwa_li_ab(BroFromDad);
        } else
            waratha.set_alikhwa_li_ab(0);

        if (!binding.calcBroFromMomEditText.getText().toString().equals("")) {
            int BroFromMom = Integer.parseInt(binding.calcBroFromMomEditText.getText().toString());
            waratha.set_alikhwa_li_ab(BroFromMom);
        } else
            waratha.set_alikhwa_li_ab(0);

        if (!binding.calcRealUncleEditText.getText().toString().equals("")) {
            int RealUncle = Integer.parseInt(binding.calcRealUncleEditText.getText().toString());
            waratha.set_ala3mam_alashika(RealUncle);
        } else
            waratha.set_ala3mam_alashika(0);

        if (!binding.calcRealCousinEditText.getText().toString().equals("")) {
            int RealCousin = Integer.parseInt(binding.calcRealCousinEditText.getText().toString());
            waratha.set_abna_ala3mam_alashika(RealCousin);
        } else
            waratha.set_abna_ala3mam_alashika(0);

        if (!binding.calcRealSonOfBroEditText.getText().toString().equals("")) {
            int RealSonOfBro = Integer.parseInt(binding.calcRealSonOfBroEditText.getText().toString());
            waratha.set_abna_alikhwa_alashika(RealSonOfBro);
        } else
            waratha.set_abna_alikhwa_alashika(0);

        if (!binding.calcSonEditText.getText().toString().equals("")) {
            int Son = Integer.parseInt(binding.calcSonEditText.getText().toString());
            waratha.set_alabna(Son);
        } else
            waratha.set_alabna(0);

        if (!binding.calcSonOfSonEditText.getText().toString().equals("")) {
            int SonOfSon = Integer.parseInt(binding.calcSonOfSonEditText.getText().toString());
            waratha.set_abna_alabna(SonOfSon);
        } else
            waratha.set_abna_alabna(0);

        if (!binding.calcRealSisEditText.getText().toString().equals("")) {
            int RealSis = Integer.parseInt(binding.calcRealSisEditText.getText().toString());
            waratha.set_alakhawat_ashakikat(RealSis);
        } else
            waratha.set_alakhawat_ashakikat(0);

        if (!binding.calcSisFromDadEditText.getText().toString().equals("")) {
            int SisFromDad = Integer.parseInt(binding.calcSisFromDadEditText.getText().toString());
            waratha.set_alakhawat_li_ab(SisFromDad);
        } else
            waratha.set_alakhawat_li_ab(0);

        if (!binding.calcSisFromMomEditText.getText().toString().equals("")) {
            int SisFromMom = Integer.parseInt(binding.calcSisFromMomEditText.getText().toString());
            waratha.set_alakhawat_li_om(SisFromMom);
        } else
            waratha.set_alakhawat_li_om(0);

        if (!binding.calcSonOfBroFromDadEditText.getText().toString().equals("")) {
            int SonOfBroFromDad = Integer.parseInt(binding.calcSonOfBroFromDadEditText.getText().toString());
            waratha.set_abna_alikhwa_li_ab(SonOfBroFromDad);
        } else
            waratha.set_abna_alikhwa_li_ab(0);

        if (!binding.calcUncleFromDadEditText.getText().toString().equals("")) {
            int UncleFromDad = Integer.parseInt(binding.calcUncleFromDadEditText.getText().toString());
            waratha.set_ala3mam_li_ab(UncleFromDad);
        } else
            waratha.set_ala3mam_li_ab(0);

        if (!binding.calcCousinFromDadEditText.getText().toString().equals("")) {
            int CousinFromDad = Integer.parseInt(binding.calcCousinFromDadEditText.getText().toString());
            waratha.set_abna_ala3mam_li_ab(CousinFromDad);
        } else
            waratha.set_abna_ala3mam_li_ab(0);

        if (!binding.cashEt.getText().toString().equals("")) {
            int cash = Integer.parseInt(binding.cashEt.getText().toString());
            waratha.setTarika(cash);
        } else
            waratha.setTarika(0);

        if (binding.radioGroup.getCheckedRadioButtonId() == R.id.radio1) {

            waratha.set_zawj(binding.husSwitch.isChecked());
        } else
            waratha.set_zawj(false);

        waratha.set_aljad(binding.calcGrandDadSwitch.isChecked());

        waratha.set_aljadah_li_ab(binding.calcGrandMaSwitch.isChecked());

        waratha.set_aljadah_li_om(binding.calcGrandMomSwitch.isChecked());

        waratha.set_alab(binding.dadSwitch.isChecked());

        waratha.set_alom(binding.momSwitch.isChecked());

        anotherCheck();

    }

    private void anotherCheck() {

        if (waratha.get_azawjat() + waratha.get_alabna() + waratha.get_albanat() + waratha.get_abna_alabna() + waratha.get_banat_alabna() +
                waratha.get_alikhwa_li_om() + waratha.get_alakhawat_li_om() + waratha.get_alikhwa_alashika() + waratha.get_alakhawat_ashakikat() +
                waratha.get_alikhwa_li_ab() + waratha.get_alakhawat_li_ab() + waratha.get_abna_alikhwa_alashika() + waratha.get_abna_alikhwa_li_ab() +
                waratha.get_ala3mam_alashika() + waratha.get_ala3mam_li_ab() + waratha.get_abna_ala3mam_alashika() + waratha.get_abna_ala3mam_li_ab() > 0
                || binding.husSwitch.isChecked() || binding.calcGrandDadSwitch.isChecked() || binding.calcGrandMaSwitch.isChecked() || binding.calcGrandMomSwitch.isChecked() || binding.dadSwitch.isChecked() || binding.momSwitch.isChecked())
            startAnswer();
        else
            openDialog();
    }

    private void startAnswer() {
        Intent intent = new Intent(CalcActivity.this, AnswerActivity.class);
        intent.putExtra("yes", waratha);
        startActivityForResult(intent, 1);
    }

    private void clearAll() {
        binding.wifeEditText.setText(null);
        binding.calcGirlEditText.setText(null);
        binding.calcGirlOfSonEditText.setText(null);
        binding.calcRealBroEditText.setText(null);
        binding.calcBroFromDadEditText.setText(null);
        binding.calcBroFromMomEditText.setText(null);
        binding.calcRealUncleEditText.setText(null);
        binding.calcRealCousinEditText.setText(null);
        binding.calcRealSonOfBroEditText.setText(null);
        binding.calcSonEditText.setText(null);
        binding.calcSonOfSonEditText.setText(null);
        binding.calcRealSisEditText.setText(null);
        binding.calcSisFromDadEditText.setText(null);
        binding.calcSisFromMomEditText.setText(null);
        binding.calcSonOfBroFromDadEditText.setText(null);
        binding.calcUncleFromDadEditText.setText(null);
        binding.calcCousinFromDadEditText.setText(null);
        binding.cashEt.setText(null);
        binding.radioGroup.check(R.id.radio0);
        binding.husSwitch.setChecked(false);
        binding.calcGrandDadSwitch.setChecked(false);
        binding.calcGrandMaSwitch.setChecked(false);
        binding.calcGrandMomSwitch.setChecked(false);
        binding.dadSwitch.setChecked(false);
        binding.momSwitch.setChecked(false);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        waratha.resetWaratha();
    }
}