package selma.mapper;

import dtos.OrderDTO;
import objects.Client;
import objects.Order;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratorTest {

    @Test
    public void should_convert_order_to_order_dto() throws Exception {

        Order order = new Order("1", LocalDate.now(), "32", new Client("1", "med", "1245", "med@gmail.com"));
        Generator generator = new Generator();
        OrderDTO orderDto = generator.map(order);
        System.out.println(orderDto);
    }
}