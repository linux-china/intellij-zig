// This is a generated file. Not intended for manual editing.
package org.ziglang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ZigMultiplyExpr extends ZigExpr {

  @NotNull
  List<ZigExpr> getExprList();

  @NotNull
  ZigMultiplyOperator getMultiplyOperator();

}