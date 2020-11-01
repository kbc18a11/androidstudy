package com.example.lesson5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class OderConfirmDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.dialog_title);
        builder.setMessage(R.string.dialog_msg);
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        builder.setNeutralButton(R.string.dialog_btn_nu, new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialogInterface, int which) {
            String msg = "";

            switch (which) {
                case DialogInterface.BUTTON_POSITIVE:
                    msg = getString(R.string.dialog_btn_ok);
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    msg = getString(R.string.dialog_btn_ng);
                    break;

                case DialogInterface.BUTTON_NEUTRAL:
                    msg = getString(R.string.dialog_btn_nu);
                    break;
            }

            Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();
        }
    }
}
