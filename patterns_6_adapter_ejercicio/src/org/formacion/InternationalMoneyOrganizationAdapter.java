package org.formacion;

public class InternationalMoneyOrganizationAdapter implements InternationalMoneyOrganization{
    private BancoNostrumIml bancoNostrumIml;

    public InternationalMoneyOrganizationAdapter(BancoNostrumIml bancoNostrumIml) {
        this.bancoNostrumIml = bancoNostrumIml;
    }

    @Override
    public void transfer(int cantidad, String cliente) {
        bancoNostrumIml.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        Integer state = bancoNostrumIml.estado(cliente);
        if(state != null){
            return state;
        }
        else{
            return 0;
        }
    }
}
