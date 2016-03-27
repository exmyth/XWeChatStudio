// Generated code from Butter Knife. Do not modify!
package com.exmyth.wechat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LoginActivity$$ViewInjector {
  public static void inject(Finder finder, final com.exmyth.wechat.activity.LoginActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361796, "field 'mEtUserName'");
    target.mEtUserName = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361798, "field 'mEtPassword'");
    target.mEtPassword = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361797, "field 'mIvClearUserName'");
    target.mIvClearUserName = view;
    view = finder.findRequiredView(source, 2131361799, "field 'mIvClearPassword'");
    target.mIvClearPassword = view;
    view = finder.findRequiredView(source, 2131361800, "field 'mBtnLogin'");
    target.mBtnLogin = (android.widget.Button) view;
  }

  public static void reset(com.exmyth.wechat.activity.LoginActivity target) {
    target.mEtUserName = null;
    target.mEtPassword = null;
    target.mIvClearUserName = null;
    target.mIvClearPassword = null;
    target.mBtnLogin = null;
  }
}
