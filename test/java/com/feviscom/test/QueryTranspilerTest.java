package com.feviscom.test;

import com.feviscom.common.TestCase;
import com.feviscom.server.transpiler.QueryTranspiler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.*;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryTranspilerTest {

    public static <A, B> List<TestCase<A, B>> zipJava8(List<A> as, List<B> bs) {
        return IntStream.range(0, Math.min(as.size(), bs.size()))
                .mapToObj(i -> new TestCase<>(as.get(i), bs.get(i)))
                .collect(Collectors.toList());
    }

    @Test
    public void testFirstAntlr() throws IOException {
        QueryTranspiler queryTranspiler = new QueryTranspiler();
        String expression = "distance eq 12";
        String sql = queryTranspiler.translate(expression);
        assertThat(sql).isEqualTo("distance == 12");
    }

    @Test
    public void testQueriesJava8() {
        List<String> filterList = Arrays.asList(
                null,
                "",
                "2",
                "date eq '2017-08-22'",
                "(date eq '2017-08-22')",
                "distance le 233.2",
                "(date eq '2016-05-01') AND ((distance gt 20) OR (distance lt 10))"
        );
        List<String> sqlList = Arrays.asList(
                null,
                "",
                "2",
                "date == '2017-08-22'",
                "(date == '2017-08-22')",
                "distance <= 233.2",
                "(date == '2016-05-01') AND ((distance > 20) OR (distance < 10))"
        );
        List<String> actualList = filterList.stream()
                .map(new QueryTranspiler()::translate)
                .collect(Collectors.toList());
        zipJava8(actualList, sqlList)
                .forEach(pair -> assertThat(pair.actual).isEqualTo(pair.expected));
    }


    @Test
    public void testQueriesJavaOld() {
        String[] filterList = {
                null,
                "",
                "2",
                "date eq '2017-08-22'",
                "(date eq '2017-08-22')",
                "distance le 233.2",
                "(date eq '2016-05-01') AND ((distance gt 20) OR (distance lt 10))"
        };
        String[] sqlList = {
                null,
                "",
                "2",
                "date == '2017-08-22'",
                "(date == '2017-08-22')",
                "distance <= 233.2",
                "(date == '2016-05-01') AND ((distance > 20) OR (distance < 10))"
        };
        QueryTranspiler queryTranspiler = new QueryTranspiler();
        for (int i = 0; i < filterList.length; i++) {
            assertThat(queryTranspiler.translate(filterList[i])).isEqualTo(sqlList[i]);
        }
    }
}
