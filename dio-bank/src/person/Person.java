package person;

import javax.swing.*;

public class Person {

    private String name;

    private String cpf;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        formatCPF(cpf);
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String formatCPF(String cpf) {
        JFormattedTextField tfcpf;
        try {

            javax.swing.text.MaskFormatter format_textField4 = new javax.swing.text.MaskFormatter("###.###.###-##");

            tfcpf = new javax.swing.JFormattedTextField(format_textField4);

        } catch (Exception e) {
        }
        return cpf;
    }

    public void infClient(){
        System.out.println(String.format("Nome: %s",this.name));
        System.out.println(String.format("Cpf: %s",this.cpf));
        System.out.println(String.format("Email: %s",this.email));
    }
}
