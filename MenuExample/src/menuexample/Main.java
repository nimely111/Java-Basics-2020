
package menuexample;
import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener{
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JmenuItem cut,copy,paste,selectAll;
    
    JTextArea  ta;
    Main(){
    f = new JFrame();
    cut = new JmenuItem(cut);
    copy = new JmenuItem(copy);
    paste = new JmenuItem(paste);
    selectAll = new JmenuItem(selectAll);
    
    cut.addActionListener(this);
    copy.addActionListener(this);
    paste.addActionListener(this);
    selectAll.addActionListener(this);
    
    mb = new JMenuBar();
    file = new JMenu("File");
    edit = new JMenu("Edit");
    help = new JMenu("Help");
    
    edit.add((Action) cut);edit.add((Action) copy);edit.add((Action) paste);edit.add((Action) selectAll);
    mb.add(file);mb.add(edit);mb.add(help);
    ta = new JTextArea();
    ta.setBounds(5,5,360,320);
    f.add(mb);f.add(ta);
    f.setJMenuBar(mb);
    f.setLayout(null);
    
    f.setSize(400,400);
    f.setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==cut)
      ta.cut();
      if(e.getSource()==paste)
       ta.paste();
      if(e.getSource()==copy)
          ta.copy();
      if(e.getSource()==selectAll)
          ta.selectAll();
    }
    public static void main(String[] args) {
      new MenuExample();  

}
    
}
