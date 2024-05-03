package view;

import javax.swing.*;

public class TurmaFrame {
    private JButton listarAlunosButton;
    private  JButton resultadoButton;
    private JButton novoresultadoButton;
    private Controlador ontrolador;

    public JButton getListarAlunosButton() {
        return listarAlunosButton;
    }

    public void setListarAlunosButton(JButton listarAlunosButton) {
        this.listarAlunosButton = listarAlunosButton;
    }

    public JButton getResultadoButton() {
        return resultadoButton;
    }

    public void setResultadoButton(JButton resultadoButton) {
        this.resultadoButton = resultadoButton;
    }

    public JButton getNovoresultadoButton() {
        return novoresultadoButton;
    }

    public void setNovoresultadoButton(JButton novoresultadoButton) {
        this.novoresultadoButton = novoresultadoButton;
    }

    public Controlador getOntrolador() {
        return ontrolador;
    }

    public void setOntrolador(Controlador ontrolador) {
        this.ontrolador = ontrolador;
    }

    public static void main(String[] args) {

    }
    private void thisWindowClosing(){

    }
    private void novoAlunoButtonActionPerformed(){

    }
    private void resultadosButtonActionPerformed(){

    }
}
