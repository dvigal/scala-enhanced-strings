package net.virtualvoid.strings

object Syntax extends ScalaEnhancedStrings {

}
/*
Syntax
------

Scala Enhanced Strings define a pluggable parser concept. This makes it possible
to change the syntax while still staying backwards-compatible.

Regardless of the exact syntax, an enhanced string is a sequence of different elements.

 * Literal strings
 * Expressions which are converted to strings:
   * By calling 'toString'
   * By using a special formatter, right now there are formatters for:
     * java.util.Date using a SimpleDateFormatter behind the scenes
     * Conditional formatting for Boolean and scala.Option values
     * Expansion and subformatting of Iterable values

Known Issues
~~~~~~~~~~~~

 * Probably some parser issues
 * Inaccurate positions in error messages
 * No possibility to switch ES off in some scopes
*/
