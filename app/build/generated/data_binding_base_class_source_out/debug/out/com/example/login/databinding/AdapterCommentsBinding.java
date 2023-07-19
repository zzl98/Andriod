// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class AdapterCommentsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout commentBox;

  @NonNull
  public final LinearLayout commentBoxRow;

  @NonNull
  public final TextView commentContent;

  @NonNull
  public final TextView commentDate;

  @NonNull
  public final TextView commentWriter;

  private AdapterCommentsBinding(@NonNull LinearLayout rootView,
      @NonNull ConstraintLayout commentBox, @NonNull LinearLayout commentBoxRow,
      @NonNull TextView commentContent, @NonNull TextView commentDate,
      @NonNull TextView commentWriter) {
    this.rootView = rootView;
    this.commentBox = commentBox;
    this.commentBoxRow = commentBoxRow;
    this.commentContent = commentContent;
    this.commentDate = commentDate;
    this.commentWriter = commentWriter;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_comments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterCommentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.comment_box;
      ConstraintLayout commentBox = ViewBindings.findChildViewById(rootView, id);
      if (commentBox == null) {
        break missingId;
      }

      LinearLayout commentBoxRow = (LinearLayout) rootView;

      id = R.id.comment_content;
      TextView commentContent = ViewBindings.findChildViewById(rootView, id);
      if (commentContent == null) {
        break missingId;
      }

      id = R.id.comment_date;
      TextView commentDate = ViewBindings.findChildViewById(rootView, id);
      if (commentDate == null) {
        break missingId;
      }

      id = R.id.comment_writer;
      TextView commentWriter = ViewBindings.findChildViewById(rootView, id);
      if (commentWriter == null) {
        break missingId;
      }

      return new AdapterCommentsBinding((LinearLayout) rootView, commentBox, commentBoxRow,
          commentContent, commentDate, commentWriter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}