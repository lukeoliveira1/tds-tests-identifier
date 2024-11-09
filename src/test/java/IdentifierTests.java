import org.example.Identifier;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// 'mvn test'
public class IdentifierTests {
    Identifier id = new Identifier();

    @Test
    void testCaseValidIdentifiers() {
        ArrayList<String> dataTests = new ArrayList<String>();
        dataTests.add("string");
        dataTests.add("test10");
        dataTests.add("t1e2s3");
        dataTests.add("test");
        dataTests.add("l");

        dataTests.forEach((data) -> {
            assertTrue(id.validateIdentifier(data), "Identificador válido esperado: " + data);
        });
    }

    @Test
    void testCaseInvalidIdentifiers() {
        ArrayList<String> dataTests = new ArrayList<String>();
        dataTests.add("stringmuitogrande");
        dataTests.add("");
        dataTests.add("1test");
        dataTests.add("###");
        dataTests.add("#test");
        dataTests.add("test t");
        dataTests.add("123456");

        dataTests.forEach((data) -> {
            assertFalse(id.validateIdentifier(data), "Identificador inválido esperado: " + data);
        });
    }
}
