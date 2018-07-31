package mapStruct.mapper;


import dtos.CommandDTO;
import objects.Client;
import objects.Command;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {

    private Client client;
    private Generator generator;

    @Before
    public void setUp() throws Exception {
        client = new Client("1", "med", "1245", "med@gmail.com");
        generator = new Generator();
    }

    @Test
    public void should_convert_command_to_command_dto() throws Exception {
        Command command = new Command("1", client);
        CommandDTO commandDTO = generator.map(command);
        checkEqual(commandDTO, command);
    }

    @Test
    public void should_convert_command_dto_to_command() throws Exception {
        CommandDTO commandDTO=new CommandDTO(2,client);
        Command command = generator.map(commandDTO);
        checkEqual(commandDTO, command);
    }

    private void checkEqual(CommandDTO commandDTO, Command command) {
        assertEquals(command.getIdCommand(),String.valueOf(commandDTO.getIdCommandInternal()));
        assertEquals(command.getClient(),commandDTO.getClient());
    }
}