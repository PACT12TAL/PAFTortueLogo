/* Generated By:JavaCC: Do not edit this line. parser_logo.java */
import java.util.ArrayList;
import classeDuProgramme.*;

public class parser_logo implements parser_logoConstants {
  public static void main(String args []) throws ParseException
  {
    parser_logo parser = new parser_logo (System.in);
    System.out.println("Reading from standard input...");
    System.out.print("Enter a valid Logo code :");
    try
    {
      program();
      System.out.println("OK.");
    }
    catch (Exception e)
    {
      System.out.println("NOK.");
      System.out.println(e.getMessage());
      parser_logo.ReInit(System.in);
    }
    catch (Error e)
    {
      System.out.println("Oops.");
      System.out.println(e.getMessage());
    }
  }

  static final public Programme program() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case fonction:
      case 12:
      case 14:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case fonction:
      case 14:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
        instruction();
        break;
      case 12:
        def_fonction();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  static final public DefFonction def_fonction() throws ParseException {
                               Token name;
    ArrayList<Instruction > instructions = new ArrayList<Instruction >();
    Instruction i;
    jj_consume_token(12);
    name = jj_consume_token(fonction);
    label_2:
    while (true) {
      i = instruction();
     instructions.add(i);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case fonction:
      case 14:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
    jj_consume_token(13);
     DefFonction fonction = new DefFonction(name, instructions);
     {if (true) return fonction;}
    throw new Error("Missing return statement in function");
  }

  static final public Instruction instruction() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 14:
      jj_consume_token(14);
      sum();
      label_3:
      while (true) {
        instruction();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case fonction:
        case 14:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
      }
      jj_consume_token(15);
      break;
    case fonction:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
      cmd();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public Commande cmd() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case fonction:
      jj_consume_token(fonction);
      break;
    case 16:
    case 17:
    case 18:
    case 19:
      deplacement();
      break;
    case 20:
    case 21:
    case 22:
    case 23:
      modifetat();
      break;
    case 24:
      efface();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public Deplacement deplacement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 16:
      jj_consume_token(16);
      jj_consume_token(nbr);
      break;
    case 17:
      jj_consume_token(17);
      jj_consume_token(nbr);
      break;
    case 18:
      jj_consume_token(18);
      jj_consume_token(nbr);
      break;
    case 19:
      jj_consume_token(19);
      jj_consume_token(nbr);
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public Etat modifetat() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 20:
      jj_consume_token(20);
      break;
    case 21:
      jj_consume_token(21);
      break;
    case 22:
      jj_consume_token(22);
      jj_consume_token(nbr);
      break;
    case 23:
      jj_consume_token(23);
      jj_consume_token(couleur);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public Efface efface() throws ParseException {
    jj_consume_token(24);
  }

  static final public void sum() throws ParseException {
    term();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      term();
    }
  }

  static final public void term() throws ParseException {
    unary();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      unary();
    }
  }

  static final public void unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
      jj_consume_token(MINUS);
      element();
      break;
    case nbr:
    case 25:
      element();
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case nbr:
      jj_consume_token(nbr);
      break;
    case 25:
      jj_consume_token(25);
      sum();
      jj_consume_token(26);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public parser_logoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[14];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1ff5200,0x1ff5200,0x1ff4200,0x1ff4200,0x1ff4200,0x1ff0200,0xf0000,0xf00000,0x60,0x60,0x180,0x180,0x2000440,0x2000400,};
   }

  /** Constructor with InputStream. */
  public parser_logo(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parser_logo(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new parser_logoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public parser_logo(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new parser_logoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public parser_logo(parser_logoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(parser_logoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[27];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 14; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 27; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
