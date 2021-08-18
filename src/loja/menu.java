package loja;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



import javax.swing.*;

public class menu extends JPanel {
	private JPanel pnPrincipal, pnTable;
	private JButton botaoFinalizar;
	private JScrollPane scrollTable; 
	private JTable table; // declaração da tabela
	private JLabel  lbTotal, produtoLabel1, produtoLabel2,
	produtoLabel3, produtoLabel4, produtoLabel5, produtoText1, produtoText2, produtoText3, produtoText4, produtoText5;
	private JTextField tfTotal, produtoTextField1, produtoTextField2,
	produtoTextField3, produtoTextField4, produtoTextField5;
	DecimalFormat df = new DecimalFormat("#,###.00"); //classe para formatar um campo da tabela;
	
    String nameProduto1, nameProduto2, nameProduto3, nameProduto4, nameProduto5;
    int  quantidadeProduto1, quantidadeProduto2, quantidadeProduto3, quantidadeProduto4, quantidadeProduto5;
    int quantidadeNota1 = 0,quantidadeNota2 = 0,quantidadeNota3 = 0 ,quantidadeNota4 = 0,quantidadeNota5 = 0;
    double precoProduto1, precoProduto2, precoProduto3, precoProduto4, precoProduto5;

	public menu() {
		inicializarComponentes();
		definirEventos();
		
	}

	private void inicializarComponentes() {
		setLayout(null);
		
		pnPrincipal = new JPanel();
		pnPrincipal.setLayout(null);
		pnPrincipal.setBounds(0, 0, 540, 500);
		
		nameProduto1 = "Mouse";
		quantidadeProduto1 = 5;
		precoProduto1 = 5.00;
		

		nameProduto2 = "Cooler";
		quantidadeProduto2 = 5;
		precoProduto2 = 15.00;
		

		nameProduto3 = "Inren 5 geração";
		quantidadeProduto3 = 5;
		precoProduto3 = 25.00;


		nameProduto4 = "Placa de vídeo";
		quantidadeProduto4 = 5;
		precoProduto4 = 45.00;
		

		nameProduto5 = "Fonte";
		quantidadeProduto5 = 5;
		precoProduto5 = 1.00;
		
		produtoLabel1 = new JLabel();
		produtoLabel1.setIcon( new ImageIcon(getClass().getResource("..\\icon\\001.png")));
		produtoLabel1.setBounds(20,10,80,80);
		pnPrincipal.add(produtoLabel1);
		
		produtoLabel2 = new JLabel();
		produtoLabel2.setIcon( new ImageIcon(getClass().getResource("..\\icon\\002.png")));
		produtoLabel2.setBounds(125,10,80,80);
		pnPrincipal.add(produtoLabel2);
		
		produtoLabel3 = new JLabel();
		produtoLabel3.setIcon( new ImageIcon(getClass().getResource("..\\icon\\003.png")));
		produtoLabel3.setBounds(225,10,80,80);
		pnPrincipal.add(produtoLabel3);
		
		produtoLabel4 = new JLabel();
		produtoLabel4.setIcon( new ImageIcon(getClass().getResource("..\\icon\\004.png")));
		produtoLabel4.setBounds(325,10,80,80);
		pnPrincipal.add(produtoLabel4);
		
		produtoLabel5 = new JLabel();
		produtoLabel5.setIcon( new ImageIcon(getClass().getResource("..\\icon\\005.png")));

		produtoLabel5.setBounds(425,10,80,80);
		pnPrincipal.add(produtoLabel5);
		
		produtoText1 = new JLabel();
		produtoText1.setFont(new Font("Segoe UI Black", 0, 14));
		produtoText1.setHorizontalAlignment(SwingConstants.CENTER);
		produtoText1.setText("Mouse");
		produtoText1.setBounds(20,100,80,30);
		pnPrincipal.add(produtoText1);
		
		produtoText2 = new JLabel();
		produtoText2.setFont(new Font("Segoe UI Black", 0, 14));
		produtoText2.setHorizontalAlignment(SwingConstants.CENTER);
		produtoText2.setText("Cooler");
		produtoText2.setBounds(125,100,80,30);
		pnPrincipal.add(produtoText2);
		
		produtoText3 = new JLabel();
		produtoText3.setFont(new Font("Segoe UI Black", 0, 14));
		produtoText3.setHorizontalAlignment(SwingConstants.CENTER);
		produtoText3.setText("Inren 5");
		produtoText3.setBounds(225,100,80,30);
		pnPrincipal.add(produtoText3);
		
		produtoText4 = new JLabel();
		produtoText4.setFont(new Font("Segoe UI Black", 0, 11));
		produtoText4.setHorizontalAlignment(SwingConstants.CENTER);
		produtoText4.setText("Placa de vídeo");
		produtoText4.setBounds(325,100,80,30);
		pnPrincipal.add(produtoText4);
		
		produtoText5 = new JLabel();
		produtoText5.setFont(new Font("Segoe UI Black", 0, 14));
		produtoText5.setHorizontalAlignment(SwingConstants.CENTER);
		produtoText5.setText("Fonte");
		produtoText5.setBounds(425,100,80,30);
		pnPrincipal.add(produtoText5);
		
	    produtoTextField1 = new JTextField();
	    produtoTextField1.setText(String.valueOf(quantidadeProduto1));
	    produtoTextField1.setHorizontalAlignment(produtoTextField1.CENTER);
	    produtoTextField1.setEditable(false);
	    produtoTextField1.setBounds(20,130,80,20);
	    pnPrincipal.add(produtoTextField1);
	    
	    produtoTextField2 = new JTextField();
	    produtoTextField2.setText(String.valueOf(quantidadeProduto2));
	    produtoTextField2.setHorizontalAlignment(produtoTextField2.CENTER);
	    produtoTextField2.setEditable(false);
	    produtoTextField2.setBounds(125,130,80,20);
	    pnPrincipal.add(produtoTextField2);

	    
	    produtoTextField3 = new JTextField();
	    produtoTextField3.setText(String.valueOf(quantidadeProduto3));
	    produtoTextField3.setHorizontalAlignment(produtoTextField3.CENTER);
	    produtoTextField3.setEditable(false);
	    produtoTextField3.setBounds(225,130,80,20);
	    pnPrincipal.add(produtoTextField3);
	    
	    produtoTextField4 = new JTextField();
	    produtoTextField4.setText(String.valueOf(quantidadeProduto4));
	    produtoTextField4.setHorizontalAlignment(produtoTextField4.CENTER);
	    produtoTextField4.setEditable(false);
	    produtoTextField4.setBounds(325,130,80,20);
	    pnPrincipal.add(produtoTextField4);
	    
	    produtoTextField5 = new JTextField();
	    produtoTextField5.setText(String.valueOf(quantidadeProduto5));
	    produtoTextField5.setHorizontalAlignment(produtoTextField5.CENTER);
	    produtoTextField5.setEditable(false);
	    produtoTextField5.setBounds(425,130,80,20);
	    pnPrincipal.add(produtoTextField5);
	    
	    
	    botaoFinalizar = new JButton("Finalizar");
	    botaoFinalizar.setBounds(380,410,100,25);
	    pnPrincipal.add(botaoFinalizar);

		
		lbTotal = new JLabel("Total de Pedidos: ");
		lbTotal.setBounds(20, 410, 100, 25);
		
		
		
		tfTotal = new JTextField();
		tfTotal.setEnabled(false);// textfield editavel ou não 
		tfTotal.setHorizontalAlignment(JTextField.CENTER);// alinhamento do texto no textfield (esquerda, direita, centro)
		tfTotal.setBounds(120, 410, 100, 25);
		
		
		
		pnPrincipal.add(lbTotal);
		pnPrincipal.add(tfTotal);
		pnTable = new JPanel(new BorderLayout());
		pnTable.setBorder(new TitledBorder("Itens do Pedido"));//linhas 64 e 65 definem a borda do painel , com o nome dele (nesse caso itens do pedido)
		scrollTable = new JScrollPane();
		df.setMinimumFractionDigits(2);//minimo de numeros depois da virgula
		df.setMaximumFractionDigits(2);// maximo de núemros depois da virgula

		
		
		DefaultTableModel tableModel = new DefaultTableModel(
				new String[] {"Produto", "Quantidade", "Preço", "Total" },0) { //cria o layout da tabela , os itens do vetor são os nomes da coluna, o 0 indica que a tabela saíra sem nenhuma linha
			public boolean isCellEditable(int row, int col) { //método para dizer se a celula será editavel ou não
				if (col == 3  ) {
					return false;
				}
				return true;
			}
		};
		table = new JTable(tableModel);//instancia a tabela e adiciona o modelo de tabela criado anteriomente a ela
		DefaultTableCellRenderer alinhaCentralizado = new DefaultTableCellRenderer(); 
		table.setEnabled(false);
		alinhaCentralizado.setHorizontalAlignment(SwingConstants.CENTER);//a variável alinhaDireita alinha o conteudo da tabela a direita 
		table.getColumnModel().getColumn(0).setPreferredWidth(100); //define o tamanho da coluna
		table.getColumnModel().getColumn(0).setResizable(false);//define se a coluna é editavel ou não ;
		table.getColumnModel().getColumn(0).setCellRenderer(alinhaCentralizado);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setCellRenderer(alinhaCentralizado);//alinha o conteúdo da ceula a direita;
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(alinhaCentralizado);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setCellRenderer(alinhaCentralizado);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);// linhas 97 e 98 define que as colunas não podem ser reorganizadas com arraste e solte
		scrollTable.setViewportView(table);
		pnTable.add(scrollTable);
		pnTable.setBounds(10, 170, 500, 230);
		pnPrincipal.add(pnTable);
		add(pnPrincipal);

	}

	private void definirEventos(){
		
		produtoLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if(quantidadeProduto1 == 0) {
            		JOptionPane.showMessageDialog(pnTable, "Acabou o estoque");
            	}else{
            		produtoTextField1.setText(String.valueOf(quantidadeProduto1-1));
            		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    			dtm.addRow(new Object[] {nameProduto1, 1, precoProduto1, 1*precoProduto1});// linhas 114 a 116 adicionam uma linha na tabela 
	    			calcularTotal();
	    			quantidadeProduto1 -= 1;
	    			quantidadeNota1 += 1;
            	}
            }
        });
		
		produtoLabel2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if(quantidadeProduto2 == 0) {
            		JOptionPane.showMessageDialog(pnTable, "Acabou o estoque");
            	}else{
            		produtoTextField2.setText(String.valueOf(quantidadeProduto2-1));
            		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    			dtm.addRow(new Object[] {nameProduto2,1,precoProduto2,1*precoProduto2});// linhas 114 a 116 adicionam uma linha na tabela 
	    			calcularTotal();
	    			quantidadeProduto2 -= 1;
	    			quantidadeNota2 +=1;
            	}	
            }
        });
		
		produtoLabel3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if(quantidadeProduto3 == 0) {
            		JOptionPane.showMessageDialog(pnTable, "Acabou o estoque");
            	}else{
            		produtoTextField3.setText(String.valueOf(quantidadeProduto3-1));
            		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    			dtm.addRow(new Object[] {nameProduto3,1, precoProduto3,1*precoProduto3});// linhas 114 a 116 adicionam uma linha na tabela 
	    			calcularTotal();
	    			quantidadeProduto3 -= 1;
	    			quantidadeNota3 += 1;
            	}
    		
            }
        });
		
		produtoLabel4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if(quantidadeProduto4 == 0) {
            		JOptionPane.showMessageDialog(pnTable, "Acabou o estoque");
            	}else{
            		produtoTextField4.setText(String.valueOf(quantidadeProduto4-1));
            		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    			dtm.addRow(new Object[] {nameProduto4,1, precoProduto4,1*precoProduto4});// linhas 114 a 116 adicionam uma linha na tabela 
	    			calcularTotal();
	    			quantidadeProduto4 -= 1;
	    			quantidadeNota4 += 1;
            	}
    		
            }
        });
		
		produtoLabel5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if(quantidadeProduto5 == 0) {
            		JOptionPane.showMessageDialog(pnTable, "Acabou o estoque");
            	}else{
            		produtoTextField5.setText(String.valueOf(quantidadeProduto5-1));
            		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    			dtm.addRow(new Object[] {nameProduto5,1, precoProduto5,1*precoProduto5});// linhas 114 a 116 adicionam uma linha na tabela 
	    			calcularTotal();
	    			quantidadeProduto5 -= 1;
	    			quantidadeNota5 += 1;
            	}
    		
            }
        });	
		
		botaoFinalizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
            	JOptionPane.showMessageDialog(pnTable,"---------------------------------------------------------------------\n PRODUTO   UNIT\n--------------------------------------------------------------------\n"+nameProduto1+"   "+quantidadeNota1+"\n"+nameProduto2+"   "+quantidadeNota2+"\n"+nameProduto3+"   "+quantidadeNota3+"\n"+nameProduto4+"   "+quantidadeNota4+"\n"+nameProduto5+"   "+quantidadeNota5+"\n---------------------------------------------------------\n TOTAL   "+tfTotal.getText());
            }
        });
	}
	
	private void calcularTotal(){
		double total = 0;
		for(int linha = 0; linha<table.getRowCount(); linha++){// for para tirar os pontoos, e virguglas do numero para calcular total
			String valor = " "+table.getValueAt(linha,3);
			total += Double.parseDouble(valor);
		}
		tfTotal.setText(""+df.format(total));
	}

	
	public static void main(String args[]){
 		JFrame frame = new JFrame("Area de Texto");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new menu());
		 frame.setBounds(300,300,540,500);
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
	 }
}
