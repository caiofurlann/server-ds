package caiofurlan.serverdistributedsystems.system.connection.send.usercrud;

import caiofurlan.serverdistributedsystems.system.connection.send.Sender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

public class SendDeleteUser extends Sender {
    public JsonNode generateAutoDeleteUserData() throws JsonProcessingException {
        return generateFinalData("excluir-proprio-usuario", false, "Usuário removido com sucesso!", null);
    }

    public String sendText() throws JsonProcessingException {
        return objectMapper.writeValueAsString(generateAutoDeleteUserData());
    }
}
