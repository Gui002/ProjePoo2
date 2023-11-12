/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author Gui
 */
public class Client_VO {
    public String nomeCliente, apelidoCliente, dataNascimento, endereco;
    public int contactoCliente;

    public Client_VO(String nomeCliente, String apelidoCliente, String dataNascimento, String endereco, int contactoCliente) {
        this.nomeCliente = nomeCliente;
        this.apelidoCliente = apelidoCliente;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contactoCliente = contactoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getApelidoCliente() {
        return apelidoCliente;
    }

    public void setApelidoCliente(String apelidoCliente) {
        this.apelidoCliente = apelidoCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
    }
    
    
}
