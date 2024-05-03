package view;

import javax.swing.*;

public class AlunosCadastradosFrame {
   private JMenuItem cadastrarMenuItem;
   private JMenuItem editarMeniItem;
   private JList alunosList;
   private Controlador controlador;

    public JMenuItem getCadastrarMenuItem() {
        return cadastrarMenuItem;
    }

    public void setCadastrarMenuItem(JMenuItem cadastrarMenuItem) {
        this.cadastrarMenuItem = cadastrarMenuItem;
    }

    public JMenuItem getEditarMeniItem() {
        return editarMeniItem;
    }

    public void setEditarMeniItem(JMenuItem editarMeniItem) {
        this.editarMeniItem = editarMeniItem;
    }

    public JList getAlunosList() {
        return alunosList;
    }

    public void setAlunosList(JList alunosList) {
        this.alunosList = alunosList;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void carregadorDados(){
        
    }

    private void cadastrarMenuItemActionPerformed(){

    }
    private void editarMenuItemActionPerformed(){

    }
    public void atualizarDados(){

    }


}
