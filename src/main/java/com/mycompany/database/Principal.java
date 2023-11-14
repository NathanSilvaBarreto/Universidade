/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.database;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        String menu = "1-Cadastrar\n 2-Atualizar\n 3Apagar\n 4Listar\n 0-sair";
        int opcao;
         Aluno aluno = new Aluno();
                
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                int ra_aluno = Integer.parseInt (JOptionPane.showInputDialog("digite o ra"));
                String telefone_aluno = JOptionPane.showInputDialog("digite o telefone");
                String nome_aluno = JOptionPane.showInputDialog("digite o nome");
                aluno.setRa_aluno(ra_aluno);
                aluno.setTelefone_aluno(telefone_aluno);
                aluno.setNome_aluno (nome_aluno);
                aluno.inserir();
               
                
                break;
                case 2:
                int id_aluno = Integer.parseInt (JOptionPane.showInputDialog("digite o id"));
                int ra_alunoa = Integer.parseInt (JOptionPane.showInputDialog("digite o ra"));
                String telefone_alunoa = JOptionPane.showInputDialog("digite o telefone");                
                String nome_alunoa = JOptionPane.showInputDialog("digite o nome");                               
                aluno.setRa_aluno(ra_alunoa);
                aluno.setTelefone_aluno(telefone_alunoa);
                aluno.setNome_aluno(nome_alunoa);
                aluno.setId_aluno(id_aluno);
                aluno.atualizar();
                                
                    break;
                case 3:
                int id_alunod = Integer.parseInt (JOptionPane.showInputDialog("digite o id que será apagado"));
                aluno.setId_aluno(id_alunod);
                aluno.apagar();
                
                        break;
                case 4:
                aluno.listar();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Opcão inválida");
                        
                
                
            }
            
        }while(opcao !=0);
        // TODO code application logic here
    }
    
}
