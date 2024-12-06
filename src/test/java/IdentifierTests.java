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
        dataTests.add("a");
        dataTests.add("a123bc");

        dataTests.forEach((data) -> {
            assertTrue(id.validateIdentifier(data), "Identificador válido esperado: " + data);
        });
    }

    @Test
    void testCaseInvalidIdentifiers() {
        ArrayList<String> dataTests = new ArrayList<String>();
        dataTests.add("");
        dataTests.add("a123bcd");
        dataTests.add("a*1bc");
        dataTests.add("1");

        dataTests.forEach((data) -> {
            assertFalse(id.validateIdentifier(data), "Identificador inválido esperado: " + data);
        });
    }
}
