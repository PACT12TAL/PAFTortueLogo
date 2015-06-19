/* Generated By:JavaCC: Do not edit this line. parser_logoTokenManager.java */
import java.util.ArrayList;
import classeDuProgramme.*;

/** Token Manager. */
public class parser_logoTokenManager implements parser_logoConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x24000L) != 0L)
            return 18;
         if ((active0 & 0x200000L) != 0L)
            return 8;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 45:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStopAtPos(0, 8);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0xa000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x24000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x4c0000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x124000L);
      case 70:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0xa000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x8c1000L);
      case 86:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 70:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x600000L);
      case 78:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x8c1000L);
      case 86:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x104000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0xc00000L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 82:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(3, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0xc8000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x1110000L);
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x808000L);
      case 76:
         return jjMoveStringLiteralDfa5_0(active0, 0x420000L);
      case 78:
         return jjMoveStringLiteralDfa5_0(active0, 0xc0000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(5, 14);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(5, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(5, 17);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(5, 24);
         return jjMoveStringLiteralDfa6_0(active0, 0x6c0000L);
      case 80:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 67:
         return jjMoveStringLiteralDfa7_0(active0, 0x600000L);
      case 68:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 69:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 71:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 82:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(6, 23);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 82:
         return jjMoveStringLiteralDfa8_0(active0, 0x640000L);
      case 84:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000L);
      case 89:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x600000L);
      case 69:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(8, 15);
         break;
      case 79:
         return jjMoveStringLiteralDfa9_0(active0, 0x140000L);
      case 85:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      case 73:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 78:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(9, 20);
         break;
      case 89:
         return jjMoveStringLiteralDfa10_0(active0, 0x600000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 72:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000L);
      case 79:
         return jjMoveStringLiteralDfa11_0(active0, 0x600000L);
      case 84:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(11, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(11, 19);
         break;
      case 78:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(11, 21);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(11, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 24;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddTwoStates(22, 23);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(22);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAdd(1);
                  }
                  else if (curChar == 82)
                     jjAddStates(0, 1);
                  else if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 18:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 19;
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 1:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (curChar == 114 && kind > 11)
                     kind = 11;
                  break;
               case 3:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 117 && kind > 11)
                     kind = 11;
                  break;
               case 7:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 116 && kind > 11)
                     kind = 11;
                  break;
               case 11:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 82)
                     jjAddStates(0, 1);
                  break;
               case 15:
                  if (curChar == 101 && kind > 11)
                     kind = 11;
                  break;
               case 16:
                  if (curChar == 103)
                     jjCheckNAdd(15);
                  break;
               case 17:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 19:
                  if (curChar == 115)
                     jjCheckNAdd(15);
                  break;
               case 20:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 24 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   18, 20, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", null, null, null, 
"\120\117\125\122", "\106\111\116", "\122\105\120\105\124\105", 
"\106\111\116\122\105\120\105\124\105", "\101\126\101\116\103\105", "\122\105\103\125\114\105", 
"\124\117\125\122\116\105\104\122\117\111\124\105", "\124\117\125\122\116\105\107\101\125\103\110\105", 
"\114\105\126\105\103\122\101\131\117\116", "\102\101\111\123\123\105\103\122\101\131\117\116", 
"\124\101\111\114\114\105\103\122\101\131\117\116", "\103\117\125\114\105\125\122", "\105\106\106\101\103\105", "\50", "\51", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[24];
static private final int[] jjstateSet = new int[48];
static protected char curChar;
/** Constructor. */
public parser_logoTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public parser_logoTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 24; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
