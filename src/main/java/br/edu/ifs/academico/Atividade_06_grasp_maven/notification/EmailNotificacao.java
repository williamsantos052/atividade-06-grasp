package br.edu.ifs.academico.Atividade_06_grasp_maven.notification;

public class EmailNotificacao implements Notificacao {
    public void enviarNotificacao(String mensagem) {
        // Lógica para envio de e-mail
        System.out.println("Email enviado: " + mensagem);
    }
}
