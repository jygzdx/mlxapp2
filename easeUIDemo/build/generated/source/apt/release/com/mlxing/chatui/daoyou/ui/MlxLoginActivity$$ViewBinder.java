// Generated code from Butter Knife. Do not modify!
package com.mlxing.chatui.daoyou.ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MlxLoginActivity$$ViewBinder<T extends MlxLoginActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131493132, "field 'imgWx' and method 'onClick'");
    target.imgWx = finder.castView(view, 2131493132, "field 'imgWx'");
    unbinder.view2131493132 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131492958, "field 'imgLogin' and method 'onClick'");
    target.imgLogin = finder.castView(view, 2131492958, "field 'imgLogin'");
    unbinder.view2131492958 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131493273, "field 'textSign' and method 'onClick'");
    target.textSign = finder.castView(view, 2131493273, "field 'textSign'");
    unbinder.view2131493273 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131493274, "field 'textFind' and method 'onClick'");
    target.textFind = finder.castView(view, 2131493274, "field 'textFind'");
    unbinder.view2131493274 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131493275, "method 'onClick'");
    unbinder.view2131493275 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MlxLoginActivity> implements Unbinder {
    private T target;

    View view2131493132;

    View view2131492958;

    View view2131493273;

    View view2131493274;

    View view2131493275;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      view2131493132.setOnClickListener(null);
      target.imgWx = null;
      view2131492958.setOnClickListener(null);
      target.imgLogin = null;
      view2131493273.setOnClickListener(null);
      target.textSign = null;
      view2131493274.setOnClickListener(null);
      target.textFind = null;
      view2131493275.setOnClickListener(null);
    }
  }
}