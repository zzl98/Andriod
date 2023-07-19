// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.login.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminUpdateUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText adminPasswordInput2;

  @NonNull
  public final Button adminUpdateButton;

  @NonNull
  public final EditText adminUsernameInput2;

  private ActivityAdminUpdateUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText adminPasswordInput2, @NonNull Button adminUpdateButton,
      @NonNull EditText adminUsernameInput2) {
    this.rootView = rootView;
    this.adminPasswordInput2 = adminPasswordInput2;
    this.adminUpdateButton = adminUpdateButton;
    this.adminUsernameInput2 = adminUsernameInput2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminUpdateUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminUpdateUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_update_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminUpdateUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin_password_input2;
      EditText adminPasswordInput2 = ViewBindings.findChildViewById(rootView, id);
      if (adminPasswordInput2 == null) {
        break missingId;
      }

      id = R.id.admin_update_button;
      Button adminUpdateButton = ViewBindings.findChildViewById(rootView, id);
      if (adminUpdateButton == null) {
        break missingId;
      }

      id = R.id.admin_username_input2;
      EditText adminUsernameInput2 = ViewBindings.findChildViewById(rootView, id);
      if (adminUsernameInput2 == null) {
        break missingId;
      }

      return new ActivityAdminUpdateUserBinding((ConstraintLayout) rootView, adminPasswordInput2,
          adminUpdateButton, adminUsernameInput2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
