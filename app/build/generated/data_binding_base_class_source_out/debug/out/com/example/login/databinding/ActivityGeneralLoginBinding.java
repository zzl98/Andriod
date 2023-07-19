// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityGeneralLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView admin;

  @NonNull
  public final ImageView imageLogin;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView passwordText;

  @NonNull
  public final Button signup;

  @NonNull
  public final EditText username;

  @NonNull
  public final TextView usernameText;

  private ActivityGeneralLoginBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView admin,
      @NonNull ImageView imageLogin, @NonNull Button login, @NonNull EditText password,
      @NonNull TextView passwordText, @NonNull Button signup, @NonNull EditText username,
      @NonNull TextView usernameText) {
    this.rootView = rootView;
    this.admin = admin;
    this.imageLogin = imageLogin;
    this.login = login;
    this.password = password;
    this.passwordText = passwordText;
    this.signup = signup;
    this.username = username;
    this.usernameText = usernameText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGeneralLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGeneralLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_general_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGeneralLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin;
      ImageView admin = ViewBindings.findChildViewById(rootView, id);
      if (admin == null) {
        break missingId;
      }

      id = R.id.imageLogin;
      ImageView imageLogin = ViewBindings.findChildViewById(rootView, id);
      if (imageLogin == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.password_text;
      TextView passwordText = ViewBindings.findChildViewById(rootView, id);
      if (passwordText == null) {
        break missingId;
      }

      id = R.id.signup;
      Button signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      id = R.id.username_text;
      TextView usernameText = ViewBindings.findChildViewById(rootView, id);
      if (usernameText == null) {
        break missingId;
      }

      return new ActivityGeneralLoginBinding((ConstraintLayout) rootView, admin, imageLogin, login,
          password, passwordText, signup, username, usernameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}