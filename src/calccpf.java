import java.util.*;

public class calccpf {
    public static void main(String[] args) {
        int digito1, digito2, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um cpf");
        String cpf_str = sc.nextLine();
        cpf_str = cpf_str.replaceAll("\\.", "").replaceAll("-", "");
        int cpf_size = cpf_str.length();
        if (cpf_str.length() != 11) {
            System.out.println("Cpf invalido");
            System.exit(0);
        }
        if (cpf_str.matches("[a-zA-Z]+")) {
            System.out.println("O cpf nao pode possuir letras");
            System.exit(0);
        }
        int[] cpf_int = new int[cpf_size];
        char[] cpf_char = new char[cpf_size];
        for (i = 0; i < cpf_size; i++) {
            cpf_char[i] = cpf_str.charAt(i);
            cpf_int[i] = Integer.parseInt(String.valueOf(cpf_char[i]));
        }
        int n1 = cpf_int[0];
        int n2 = cpf_int[1];
        int n3 = cpf_int[2];
        int n4 = cpf_int[3];
        int n5 = cpf_int[4];
        int n6 = cpf_int[5];
        int n7 = cpf_int[6];
        int n8 = cpf_int[7];
        int n9 = cpf_int[8];
        digito1 = cpf_int[9];
        digito2 = cpf_int[10];
        int soma_cpf1 = (n1 * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4) + (n8 * 3) + (n9 * 2);
        int resto1 = soma_cpf1 % 11;
        int verificador1 = 11 - resto1;
        if (verificador1 >= 10)
        {
            verificador1 = 0;
        }
        int soma_cpf2 = (n1 * 11) + (n2 * 10) + (n3 * 9) + (n4 * 8) + (n5 * 7) + (n6 * 6) + (n7 * 5) + (n8 * 4) + (n9 * 3) + (verificador1*2);
        int resto2 = soma_cpf2 % 11;
        int verificador2 = 11 - resto2;
        if (verificador2 >= 10)
        {
            verificador2 = 0;
        }
        if (cpf_str.equals("11111111111") || cpf_str.equals("22222222222") || cpf_str.equals("33333333333") || cpf_str.equals("44444444444") || cpf_str.equals("55555555555") || cpf_str.equals("66666666666") || cpf_str.equals("77777777777") || cpf_str.equals("88888888888") || cpf_str.equals("99999999999") || cpf_str.equals("00000000000"))
        {
            System.out.println("CPF inválido");
            System.exit(0);
        }
        if (verificador1 == digito1 && verificador2 == digito2)
        {
            System.out.println("CPF válido");
        }
        else{
            System.out.println("CPF inválido");
        }
    }
}