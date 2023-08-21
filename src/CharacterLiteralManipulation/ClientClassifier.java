package CharacterLiteralManipulation;

public class ClientClassifier {
    public static void getClientsByType(Client[] clients, String type, Client[] result){
        if(clients == null || clients.length == 0)
            System.out.println("Clients array is null or empty");
        else if (result == null || result.length == 0)
            System.out.println("Result array is null or empty");
        else{
            for(int i = 0, j = 0; i < clients.length && j < result.length; i++){
                if(clients[i].type.intern() == type.intern()){
                    if(j != result.length){
                        result[j] = clients[i];
                        j++;
                    }
                    else{
                        System.out.println("Result array length exceeded");
                    }
                }
            }
        }
    }
    public static void printClients(Client[] clients){
        if(clients != null && clients.length > 0)
        {
            for(Client client : clients){
                StringBuilder str = new StringBuilder();
                str.append("{");
                str.append(client.id);
                str.append("};{");
                str.append(client.name);
                str.append("};{");
                str.append(client.type);
                str.append("};{");
                str.append(client.sum);
                str.append("}");
                System.out.println(str.toString());
            }
        }
    }
}
