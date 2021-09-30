public class Principal {
    public static void main(String args[]){
        Funcionario f=new Funcionario();
        f.setNome("Carla");
        f.setCpf("123.456.789-00");
        f.setSalario(2500);
        f.setDepartamento("Financeiro");

        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(f.getSalario());
        System.out.println(f.getDepartamento());
    }
    
}
