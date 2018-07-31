package mapStruct.mapper;

import dtos.CommandDTO;
import javax.annotation.Generated;
import objects.Command;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-31T10:32:22+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_45 (Oracle Corporation)"
)
public class MapperDtoImpl implements MapperDto {

    @Override
    public CommandDTO map(Command source) {
        if ( source == null ) {
            return null;
        }

        CommandDTO commandDTO = new CommandDTO();

        commandDTO.setIdCommandInternal( source.getIdCommand() );
        commandDTO.setClient( source.getClient() );

        return commandDTO;
    }

    @Override
    public Command map(CommandDTO source) {
        if ( source == null ) {
            return null;
        }

        Command command = new Command();

        command.setIdCommand( source.getIdCommandInternal() );
        command.setClient( source.getClient() );

        return command;
    }
}
