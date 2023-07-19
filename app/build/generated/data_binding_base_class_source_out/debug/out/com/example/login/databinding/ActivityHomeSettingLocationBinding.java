// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.login.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeSettingLocationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button cancelGetLocation;

  @NonNull
  public final TextView getLocationWait;

  @NonNull
  public final Button relocate;

  @NonNull
  public final TextView textView25;

  private ActivityHomeSettingLocationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button cancelGetLocation, @NonNull TextView getLocationWait,
      @NonNull Button relocate, @NonNull TextView textView25) {
    this.rootView = rootView;
    this.cancelGetLocation = cancelGetLocation;
    this.getLocationWait = getLocationWait;
    this.relocate = relocate;
    this.textView25 = textView25;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeSettingLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeSettingLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_setting_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeSettingLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_get_location;
      Button cancelGetLocation = ViewBindings.findChildViewById(rootView, id);
      if (cancelGetLocation == null) {
        break missingId;
      }

      id = R.id.get_location_wait;
      TextView getLocationWait = ViewBindings.findChildViewById(rootView, id);
      if (getLocationWait == null) {
        break missingId;
      }

      id = R.id.relocate;
      Button relocate = ViewBindings.findChildViewById(rootView, id);
      if (relocate == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      return new ActivityHomeSettingLocationBinding((ConstraintLayout) rootView, cancelGetLocation,
          getLocationWait, relocate, textView25);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}