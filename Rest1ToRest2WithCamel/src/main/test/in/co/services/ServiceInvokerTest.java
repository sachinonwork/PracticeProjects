package in.co.services;


public class ServiceInvokerTest extends GroovyTestCase {

    @Test
    void should_show_message_from_service() {
        assert "SUCCESS" == invokerService.callService();
    }

}
