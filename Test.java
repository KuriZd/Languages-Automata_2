import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(System.in);
        idsLexer lexer = new idsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        idsParser parser = new idsParser(tokens);
        parser.inicio();
    }
}
