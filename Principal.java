public class Principal {
    public static void main(String args[]){
        Funcionario f=new Funcionario();
        f.setNome("Carla Martins");
        f.setCpf("123.456.789-00");
        f.setSalario(2500);
        f.setDepartamento("Financeiro");

        System.out.println("O nome do funcionário é "+f.getNome());
        System.out.println("Cujo CPF corresponde ao número " +f.getCpf());
        System.out.println("Seu salário é equivalente a R$ " +f.getSalario());
        System.out.println("A mesma pertence ao setor " + f.getDepartamento() +" da empresa");
    }
    
}
