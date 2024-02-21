import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; //interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens
/**
 * swing
 */
public class LabelFrame {
    private JLabel label1; //JLabel com texto e ícone adicionados
   
    // construindo a janela
    public LabelFrame(){
        // construindo a janela
        super("Teating JLabel");
        setLayout(new FlowLayout()); // configura o layout de frame
        // Construtor JLabel com um argumento de string
        Icon logo = new ImageIcon(getClass().getResource("logo.png"));// carregando imagem
        label1 = new JLabel(); // Construtor JLabel sem argumentos
        label1.setText("");
        label1.setIcon(logo); // adiciona icone ao JLabel
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setToolTipText("This is label");
        add(label1); // adiciona label3 ao JFrame
        
    
}
