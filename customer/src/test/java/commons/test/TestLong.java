package commons.test;

import org.junit.jupiter.api.Test;

public class TestLong {
    @Test
    public void test() {
        String id = "3000";
        s(Long.parseLong(id));
    }

    void s(Long id) {
        System.out.println(id);
    }
}
