/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerSlide;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] arg) {

        Disciplina[] d = new Disciplina[3];
        String[] s = new String[5];
        float[] f = new float[6];

        f[0] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota1"));
        f[1] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota2"));
        f[2] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota3"));
        s[0] = JOptionPane.showInputDialog("Entre com o Nome");
        s[1] = JOptionPane.showInputDialog("Entre com o Periodo");

        d[0] = new DisciplinaSemestral(f[2], s[0], s[1], f[0], f[1]);
        JOptionPane.showMessageDialog(null, "Sua nota no Semestre\n" + d[0].avaliarDisciplina());

        f[0] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota1"));
        f[1] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota2"));
        s[0] = JOptionPane.showInputDialog("Entre com o Nome");
        s[1] = JOptionPane.showInputDialog("Entre com o Periodo");
        d[1] = new DisciplinaTrimestral(s[0], s[1], f[0], f[1]);

        JOptionPane.showMessageDialog(null, "Sua nota no Trimestre\n" + d[1].avaliarDisciplina());
        
        f[0] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota1"));
        f[1] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota2"));
        f[2] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota3"));
        f[3] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota4"));
        f[4] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota5"));
        f[5] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota6"));
        s[0] = JOptionPane.showInputDialog("Entre com o Nome");
        s[1] = JOptionPane.showInputDialog("Entre com o Periodo");
        
        d[2] = new DisciplinaAnual(f[2], f[3], f[4], f[5], s[0], s[1], f[0], f[1]);
        JOptionPane.showMessageDialog(null, "Sua nota no Ano\n" + d[2].avaliarDisciplina());

    }
}
