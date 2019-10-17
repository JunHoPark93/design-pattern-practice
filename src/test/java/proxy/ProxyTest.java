package proxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {
    @Test
    void simpleProxyTest() {
        Hello hello = new HelloTarget();
        assertThat(hello.sayHello("Jay")).isEqualTo("Hello Jay");
    }

    @Test
    void simpleProxyUpperCaseTest() {
        Hello hello = new HelloUppserCase(new HelloTarget());
        assertThat(hello.sayHello("Jay")).isEqualTo("HELLO JAY");
    }
}
