package ch03.data;

import ch03.engine.Context;



/**
 * @author Tom Baeyens
 */
public interface OutputExpression {

  void setTypedValue(Context context, TypedValue value);

}
