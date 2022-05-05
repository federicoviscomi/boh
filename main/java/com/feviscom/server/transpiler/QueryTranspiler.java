package com.feviscom.server.transpiler;


import com.feviscom.server.antlr4.JogFilterLexer;
import com.feviscom.server.antlr4.JogFilterParser;
import org.antlr.runtime.BitSet;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.Locale;

/**
 * The API filtering should allow using parenthesis for defining operations precedence and use any combination
 * of the available fields. The supported operations should at least include or, and, eq (equals), ne (not equals),
 * gt (greater than), lt (lower than).
 * <p>
 * Example -> (date eq '2016-05-01') AND ((distance gt 20) OR (distance lt 10))
 * <p>
 * Query ::=
 * | Unit
 * | Query BinOP Query
 * | UnOp Query
 * <p>
 * BinOP ::=
 * | AND
 * | OR
 * | XOR
 * <p>
 * UnOp ::=
 * | NOT
 * <p>
 * <p>
 * Unit ::=
 * | Field BinFieldOp Field
 * <p>
 * BinFieldOp :==
 */
public class QueryTranspiler {

    private final ANTLRErrorListener _listener = createErrorListener();

    public QueryTranspiler() {

    }

    public String translate(String filter) {
        return this.parse(filter);
    }


    /**
     * Parses an expression into an integer result.
     * @param expression the expression to part
     * @return and integer result
     */
    private String parse(final String expression) {
        /*
         * Create a lexer that reads from our expression string
         */
        final JogFilterLexer lexer = new JogFilterLexer(new ANTLRInputStream(expression));

        /*
         * By default Antlr4 lexers / parsers have an attached error listener
         * that prints errors to stderr. I prefer them to throw an exception
         * instead so I implemented my own error listener which is attached
         * here. I also remove any existing error listeners.
         */
        lexer.removeErrorListeners();
        lexer.addErrorListener(_listener);

        /*
         * The lexer reads characters and lexes them into token stream. The
         * tokens are consumed by the parser that then builds an Abstract
         * Syntax Tree.
         */
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final JogFilterParser parser = new JogFilterParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(_listener);

        /*
         * The ExprContext is the root of our Abstract Syntax Tree
         */
        final JogFilterParser.ExprContext context = parser.expr();

        /*
         * 'Visit' all the branches of the tree to get our expression result.
         */
        return visit(context);
    }

    /*
     * Visits the branches in the expression tree recursively until we hit a
     * leaf.
     */
    private String visit(final JogFilterParser.ExprContext context) {
        System.out.println(context);
        System.out.println(context.getClass());
        /*if (context.number() != null) { //Just a number
            return Integer.parseInt(context.number().getText());
        }
        else if (context.BR_CLOSE() != null) { //Expression between brackets
            return visit(context.expr(0));
        }
        else if (context.TIMES() != null) { //Expression * expression
            return visit(context.expr(0)) * visit(context.expr(1));
        }
        else if (context.DIV() != null) { //Expression / expression
            return visit(context.expr(0)) / visit(context.expr(1));
        }
        else if (context.PLUS() != null) { //Expression + expression
            return visit(context.expr(0)) + visit(context.expr(1));
        }
        else if (context.MINUS() != null) { //Expression - expression
            return visit(context.expr(0)) - visit(context.expr(1));
        }
        else {
            throw new IllegalStateException();
        }*/
        return "stringa!!!";
    }


    /*
     * Helper method to create an ANTLRErrorListener. We're only interested in
     * the syntaxError method.
     */
    private static ANTLRErrorListener createErrorListener() {
        return new ANTLRErrorListener() {
            public void syntaxError(final Recognizer<?, ?> arg0, final Object obj, final int line, final int position, final String message, final RecognitionException ex) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "Exception parsing expression: '%s' on line %s, position %s", message, line, position));
            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, java.util.BitSet ambigAlts, ATNConfigSet configs) {

            }

            @Override
            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, java.util.BitSet conflictingAlts, ATNConfigSet configs) {

            }

            public void reportContextSensitivity(final Parser arg0, final DFA arg1, final int arg2, final int arg3, final int arg4, final ATNConfigSet arg5) {
            }

            public void reportAttemptingFullContext(final Parser arg0, final DFA arg1, final int arg2, final int arg3, final BitSet arg4, final ATNConfigSet arg5) {
            }

            public void reportAmbiguity(final Parser arg0, final DFA arg1, final int arg2, final int arg3, final boolean arg4, final BitSet arg5, final ATNConfigSet arg6) {
            }
        };
    }
}