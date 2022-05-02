package Graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelCrearProyecto extends JPanel implements ActionListener{
	
	private JTextField n_textfield;
	private JLabel n_label;
	private JTextField d_textfield;
	private JLabel d_label;
	private JTextField fecha_inicio;
	private JLabel f_inicio_label;
	private JTextField fecha_final;
	private JLabel f_final_label;
	private JTextField tipo_txtfield;
	private JLabel tipo_label;
	private JButton btn_aceptar= new JButton("Guardar nuevo proyecto");
	
	
	public PanelCrearProyecto(PanelAplicacion al) {
		
		setBackground(Color.LIGHT_GRAY);
		//Se inicializa un GridLayout para acomodar los campos de texto y Labels
		setLayout(new GridLayout(7, 2, 20, 50));
		TitledBorder border = new TitledBorder( "Crear Proyecto" );
		setBorder(border);
		
		//Se crean los Labels y Textfields y se agregan al panel
		n_label= new JLabel("Nombre del proyecto: ");
        add(n_label);
        n_textfield=new JTextField();
        add(n_textfield);
        
        d_label= new JLabel("Descripcion del proyecto: ");
        add(d_label);
        d_textfield=new JTextField();
        add(d_textfield);
        
        f_inicio_label= new JLabel("Fecha de inicio del proyecto: ");
        add(f_inicio_label);
        fecha_inicio= new JTextField();
        add(fecha_inicio);
        
        f_final_label= new JLabel("Fecha final del proyecto (si se conoce): ");
        add(f_final_label);
        fecha_final= new JTextField();
        add(fecha_final);
        
        tipo_label= new JLabel("Digite el tipo del proyecto:");
        add(tipo_label);
        tipo_txtfield= new JTextField();
        add(tipo_txtfield);
		
        btn_aceptar.setPreferredSize(new Dimension(40, 40));
        add(btn_aceptar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
