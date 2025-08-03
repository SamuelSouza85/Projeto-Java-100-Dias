package Dia085.Threads.Teste;

import Dia085.Threads.Dominio.Members;
import Dia085.Threads.Service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTeste01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread samuel = new Thread(new EmailDeliveryService(members), "Samuel");
        Thread cleber = new Thread(new EmailDeliveryService(members), "Cleber");
        samuel.start();
        cleber.start();
        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
