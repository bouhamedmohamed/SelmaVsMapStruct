package mapStruct.mapper;

import dtos.CommandDTO;
import objects.Command;
import org.mapstruct.factory.Mappers;

public class Generator implements mapStruct.mapper.MapperDto {
    mapStruct.mapper.MapperDto mapper = Mappers.getMapper(mapStruct.mapper.MapperDto.class);

    @Override
    public CommandDTO map(Command source) {
        return mapper.map(source);
    }

    @Override
    public Command map(CommandDTO source) {
        return mapper.map(source);
    }

}

