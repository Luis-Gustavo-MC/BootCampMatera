public abstract class Conta implements IConta{
    private Double extrato;

    public Conta(Double extrato) {
        this.extrato = extrato;
    }
    public Double getExtrato() {
        return extrato;
    }

    public void setExtrato(Double extrato) {
        this.extrato = extrato;
    }

    
}
