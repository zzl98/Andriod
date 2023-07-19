// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.login.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton adminAddButton;

  @NonNull
  public final FloatingActionButton adminRefreshButton;

  @NonNull
  public final RecyclerView adminUserList;

  @NonNull
  public final FloatingActionButton deleteButton;

  private ActivityAdminBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton adminAddButton,
      @NonNull FloatingActionButton adminRefreshButton, @NonNull RecyclerView adminUserList,
      @NonNull FloatingActionButton deleteButton) {
    this.rootView = rootView;
    this.adminAddButton = adminAddButton;
    this.adminRefreshButton = adminRefreshButton;
    this.adminUserList = adminUserList;
    this.deleteButton = deleteButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin_add_button;
      FloatingActionButton adminAddButton = ViewBindings.findChildViewById(rootView, id);
      if (adminAddButton == null) {
        break missingId;
      }

      id = R.id.admin_refresh_button;
      FloatingActionButton adminRefreshButton = ViewBindings.findChildViewById(rootView, id);
      if (adminRefreshButton == null) {
        break missingId;
      }

      id = R.id.admin_user_list;
      RecyclerView adminUserList = ViewBindings.findChildViewById(rootView, id);
      if (adminUserList == null) {
        break missingId;
      }

      id = R.id.delete_button;
      FloatingActionButton deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      return new ActivityAdminBinding((ConstraintLayout) rootView, adminAddButton,
          adminRefreshButton, adminUserList, deleteButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
