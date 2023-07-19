// Generated by view binder compiler. Do not edit!
package com.example.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.login.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPostViewCommentsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MultiAutoCompleteTextView addCommentTextbox;

  @NonNull
  public final Button backToPost;

  @NonNull
  public final RecyclerView commentList;

  @NonNull
  public final ConstraintLayout constraintLayout5;

  @NonNull
  public final Button submitComment;

  private ActivityPostViewCommentsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MultiAutoCompleteTextView addCommentTextbox, @NonNull Button backToPost,
      @NonNull RecyclerView commentList, @NonNull ConstraintLayout constraintLayout5,
      @NonNull Button submitComment) {
    this.rootView = rootView;
    this.addCommentTextbox = addCommentTextbox;
    this.backToPost = backToPost;
    this.commentList = commentList;
    this.constraintLayout5 = constraintLayout5;
    this.submitComment = submitComment;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPostViewCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPostViewCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_post_view_comments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPostViewCommentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_comment_textbox;
      MultiAutoCompleteTextView addCommentTextbox = ViewBindings.findChildViewById(rootView, id);
      if (addCommentTextbox == null) {
        break missingId;
      }

      id = R.id.back_to_post;
      Button backToPost = ViewBindings.findChildViewById(rootView, id);
      if (backToPost == null) {
        break missingId;
      }

      id = R.id.comment_list;
      RecyclerView commentList = ViewBindings.findChildViewById(rootView, id);
      if (commentList == null) {
        break missingId;
      }

      id = R.id.constraintLayout5;
      ConstraintLayout constraintLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout5 == null) {
        break missingId;
      }

      id = R.id.submit_comment;
      Button submitComment = ViewBindings.findChildViewById(rootView, id);
      if (submitComment == null) {
        break missingId;
      }

      return new ActivityPostViewCommentsBinding((ConstraintLayout) rootView, addCommentTextbox,
          backToPost, commentList, constraintLayout5, submitComment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
