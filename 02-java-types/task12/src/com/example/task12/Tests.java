package com.example.task12;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;

public class Tests {

    private void check(BigDecimal sum, BigDecimal percent, BigDecimal result) {
        sum = sum.setScale(9, BigDecimal.ROUND_HALF_UP);
        percent = percent.setScale(9, BigDecimal.ROUND_HALF_UP);
        result = result.setScale(9, BigDecimal.ROUND_HALF_UP);
        Assertions.assertThat(Task12.benefit(sum, percent)).as("sum = %s, percent = %s", sum, percent).isEqualTo(result);
    }

    @Test
    public void test() throws Exception {
        check(new BigDecimal(500), new BigDecimal(0.00000001), new BigDecimal(500.000060000));
        check(new BigDecimal(150), new BigDecimal(0.0000001), new BigDecimal(150.000180000));
        check(new BigDecimal(222), new BigDecimal(0.00000179), new BigDecimal(222.004768607));
        check(new BigDecimal(15), new BigDecimal(0.000000009), new BigDecimal(15.000001620));
        check(new BigDecimal(1000), new BigDecimal(0), new BigDecimal(1000));
        check(new BigDecimal(1000), new BigDecimal(1), new BigDecimal(4096000));
    }

    @Test
    public void testContent() throws Exception {
        MethodDeclaration method = new CodeParser("task11", Task12.class).findSingleMethod("benefit");
        Assertions.assertThat(method.getDeclarationAsString(true, true, true))
                .as("Method declaration")
                .isEqualTo("public static BigDecimal benefit(BigDecimal sum, BigDecimal percent)");
        Assertions.assertThat(method.findAll(VariableDeclarator.class))
                .as("Declared variables")
                .allMatch((v) -> {
                    return (v.getType().isPrimitiveType() && v.getType().asString().equals("int")) || v.getType().asString().equals("BigDecimal");
                }, "only int and BigDecimal types allowed");
    }

}
