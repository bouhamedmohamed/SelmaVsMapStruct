package dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandDTO {
    private Integer idCommandInternal;
    private objects.Client client;

    public void setIdCommandInternal(String idCommandInternal) {
        this.idCommandInternal = Integer.parseInt(idCommandInternal);
    }
}
