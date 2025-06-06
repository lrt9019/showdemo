// Generated by view binder compiler. Do not edit!
package com.kk4vcz.goodv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kk4vcz.goodv.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProgramBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button programButton;

  @NonNull
  public final EditText programText;

  private FragmentProgramBinding(@NonNull FrameLayout rootView, @NonNull Button programButton,
      @NonNull EditText programText) {
    this.rootView = rootView;
    this.programButton = programButton;
    this.programText = programText;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProgramBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProgramBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_program, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProgramBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.program_button;
      Button programButton = ViewBindings.findChildViewById(rootView, id);
      if (programButton == null) {
        break missingId;
      }

      id = R.id.program_text;
      EditText programText = ViewBindings.findChildViewById(rootView, id);
      if (programText == null) {
        break missingId;
      }

      return new FragmentProgramBinding((FrameLayout) rootView, programButton, programText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
