package com.example.task09;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.stmt.ReturnStmt;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    @Test
    public void testResult() {
        Assertions.assertThat(Task09.solution()).as("Result").isEqualTo(0.0d);
    }

}
