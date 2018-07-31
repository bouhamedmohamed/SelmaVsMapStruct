package objects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Command {
    private String idCommand;
    private objects.Client client;

    public void setIdCommand(Integer idCommand) {
        this.idCommand = String.valueOf(idCommand);
    }
}
