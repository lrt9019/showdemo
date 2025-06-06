// Generated by view binder compiler. Do not edit!
package com.kk4vcz.goodv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kk4vcz.goodv.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDumpBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button dumpexportbutton;

  @NonNull
  public final TextView dumptext;

  private FragmentDumpBinding(@NonNull FrameLayout rootView, @NonNull Button dumpexportbutton,
      @NonNull TextView dumptext) {
    this.rootView = rootView;
    this.dumpexportbutton = dumpexportbutton;
    this.dumptext = dumptext;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDumpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDumpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dump, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDumpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dumpexportbutton;
      Button dumpexportbutton = ViewBindings.findChildViewById(rootView, id);
      if (dumpexportbutton == null) {
        break missingId;
      }

      id = R.id.dumptext;
      TextView dumptext = ViewBindings.findChildViewById(rootView, id);
      if (dumptext == null) {
        break missingId;
      }

      return new FragmentDumpBinding((FrameLayout) rootView, dumpexportbutton, dumptext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
