package mapStruct.mapper;

import dtos.CommandDTO;
import objects.Command;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface MapperDto {
    @Mappings({
            @Mapping(source = "idCommand", target = "idCommandInternal")
    })
    CommandDTO map(Command source);

    @Mapping(source = "idCommandInternal", target = "idCommand")
    Command map(CommandDTO source);
}
