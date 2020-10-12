package com.example.task05;

import codecheck.CodeParser;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.CatchClause;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Tests {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @Before
    public void setUpSystemOut() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void cleanUpSystemOut() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testCatchFileNotFound() {
        String[] args = {"abcd"};
        try {
            Task05Main.main(args);
            String actual = out.toString();
            Assert.assertEquals("файл \"abcd\" не найден\n", actual);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw new AssertionError("метод main не должен бросать исключение IOException", e);
            }
        }

    }

    @Test
    public void testMainNotDeclareThrows() throws Exception {
        MethodDeclaration method = new CodeParser("task05", Task05Main.class).findSingleMethod("main");
        NodeList thrownExceptionsList = method.getThrownExceptions();
        Assert.assertEquals("method main does not declare throws",0, thrownExceptionsList.size());
    }

    @Test
    public void testMainContainsTwoCatchClauses() throws Exception {
        MethodDeclaration method = new CodeParser("task05", Task05Main.class).findSingleMethod("main");
        List<CatchClause> catchClauses = method.findAll(CatchClause.class);
        Assert.assertEquals("method main body contains 2 catch clauses", 2, catchClauses.size());

        CatchClause firstCatchClause = catchClauses.get(0);
        Assert.assertTrue("first catch clause should be FileNotFoundException",
                firstCatchClause.getParameter().getType().toString().contains("FileNotFoundException"));

        CatchClause secondCatchClause = catchClauses.get(1);
        Assert.assertTrue("second catch clause should be IOException",
                secondCatchClause.getParameter().getType().toString().contains("IOException"));
    }

}