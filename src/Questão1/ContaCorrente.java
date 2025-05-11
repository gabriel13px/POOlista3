package Questão1;

 class ContaCorrente implements Tributavel {
     private double saldo;

     public ContaCorrente(double saldo) throws NumeroNegativoException {
         if (saldo < 0) {
             throw new NumeroNegativoException("O saldo não pode ser negativo!");
         }
         this.saldo = saldo;
     }

     public double getSaldo() {
         return saldo;
     }

     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }

     @Override
     public double getValorImposto() {
         return saldo * 0.01;
     }
}
