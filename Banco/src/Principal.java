public class Principal {

    public static void main(String[] args) {
//        Conta c1 = new Conta("Tatiana","123456", "123X", 500);
//        Conta c2 = new Conta("Manuela","123457", "123X", 550);



        ContaCorrente c1 = new ContaCorrente("Tatiana","123456", "123X", 500);
        ContaCorrente c2 = new ContaCorrente("Manuela","123457", "123X", 550);

        c1.mostrarDados();
        c2.mostrarDados();

        c1.sacar(100);
        c2.sacar(200);

        c1.depositar(235.76);

        ContaEspecial ce1 = new ContaEspecial("Barbára","123458",
                "X123",560,1000);
        ce1.mostrarDados();
    }
}
