package selma.mapper;

import dtos.OrderDTO;
import fr.xebia.extras.selma.Selma;
import objects.Order;

public class Generator implements MapperDto {
    private MapperDto mapper = Selma.builder(MapperDto.class).build();

    @Override
    public OrderDTO map(Order in) {
        return mapper.map(in);
    }

}

