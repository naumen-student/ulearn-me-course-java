package com.example.task11;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Tests {

    private void check(float sum, float percent, float result) {
        Assertions.assertThat(Task11.benefit(sum, percent)).as("sum = %s, percent = %s", sum, percent).isEqualTo(result);
    }

    @Test
    public void test() {
        check(500, 0.00000001f, 500.00006f);
        check(150, 0.0000001f, 150.00018f);
        check(222, 0.00000179f, 222.00478f);
        check(15, 0.000000009f, 15.000002f);
        check(1000, 0f, 1000f);
        check(1000, 1f, 4096000f);
        check(500, 0.0100077f, 563.46405f);
    }

    @Test
    public void testContent() throws Exception {
        MethodDeclaration method = new CodeParser("task11", Task11.class).findSingleMethod("benefit");
        Assertions.assertThat(method.getDeclarationAsString(true, true, true))
                .as("Method declaration")
                .isEqualTo("public static float benefit(float sum, float percent)");
        Assertions.assertThat(method.findAll(VariableDeclarator.class))
                .as("Declared variables")
                .allMatch((v) -> v.getType().isPrimitiveType() && !v.getType().asString().equals("double"), "only int and float types allowed");
    }
}
