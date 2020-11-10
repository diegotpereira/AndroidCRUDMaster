package br.com.java;

import android.content.Context;

public class ClienteDAO {
    private final String TABLE_CLIENTES = "Clientes";
    private DbGateway gw;

    public ClienteDAO(Context ctx){
        gw = DbGateway.getInstance(ctx);
    }

}
