package selma.mapper;

import dtos.OrderDTO;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;
import objects.Order;

@Mapper(
        withCustomFields = {
                @Field({"idOrderInternal", "idOrder"})

        }
)
public interface MapperDto {
    OrderDTO map(Order in);

}