package view;

import javax.swing.*;


public class AlunoFrame {

    private JTextField nomeTextField;
    private JButton okButton;
    private JButton cancelarButtton;
    private JTextField notaTextField;
    private Controlador controlador;
    private Aluno aluno;
    private boolean editando;

    public JTextField getNomeTextField() {
        return nomeTextField;
    }

    public void setNomeTextField(JTextField nomeTextField) {
        this.nomeTextField = nomeTextField;
    }

    public JButton getOkButton() {
        return okButton;
    }

    public void setOkButton(JButton okButton) {
        this.okButton = okButton;
    }

    public JButton getCancelarButtton() {
        return cancelarButtton;
    }

    public void setCancelarButtton(JButton cancelarButtton) {
        this.cancelarButtton = cancelarButtton;
    }

    public JTextField getNotaTextField() {
        return notaTextField;
    }

    public void setNotaTextField(JTextField notaTextField) {
        this.notaTextField = notaTextField;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

    public void seControlador(){

    }
    private void thisWindowClosing(){

    }
    private void cancelarButtonActionPerformed(){

    }
    private void cancelar(){

    }
    private void okButtonActionPerformed(){

    }
    public void carregarDados(){


    }

}
