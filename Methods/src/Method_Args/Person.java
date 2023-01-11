package Method_Args;

import Method_Obj_Args.Client;

public class Person {
    public String name;
    public ImcResult calcImc(Client client){ //São usados parâmetros ou argumentos

        ImcResult imcResult = new ImcResult();
        imcResult.result = client.weight / (client.height * client.height);

        return imcResult;
    }

}
