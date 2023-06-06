package classes;

import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class ScreenProtector extends javax.swing.JFrame implements Runnable{

	// tamanho da tela
	private int height = 900;
	private int whidth = 1300;
	
	// teclas
	/*
	 * Funcionamento: quando a tecla é pressionada sua respectiva variável fica 
	 * com valor True. Quando solta a variável fica com valor False.
	 */
	private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
	
    // Construtor
	public ScreenProtector() {
        // Chama o metodo que realiza todas as configurações iniciais necessárias
		initComponents();
		
		// Mecanismo de execução paralela
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Realiza todas as configurações iniciais necessárias
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Chama os métodos de Scaneamento de teclas (tecla pressionada / solta)
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        
        // Configura o layout da tela
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Largura
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, whidth, Short.MAX_VALUE)
        );
        // Altura
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, height, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que verifica se as teclas foram pressionadas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // Verifica se a tecla seta para a esquerda foi pressiona
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            // coloca o valor da variavel left em true enquanto a tecla estiver pressionada
    		left = true;
        }
    	// Verifica se a tecla seta para a direita foi pressiona
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        	// coloca o valor da variavel right em true enquanto a tecla estiver pressionada
        	right = true;
        }
    	// Verifica se a tecla seta para cima foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_UP) 
        {
        	// coloca o valor da variavel up em true enquanto a tecla estiver pressionada
            up = true;
        }
    	// Verifica se a tecla seta para baixo foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) 
        {
        	// coloca o valor da variavel down em true enquanto a tecla estiver pressionada
            down = true;
        }
    }//GEN-LAST:event_formKeyPressed

    // Método que verifica se as teclas foram soltas
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
    	// Verifica se a tecla seta para a esquerda foi solta
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
    		// volta o valor da variavel left em false depois que a tecla for solta
    		left = false;
        } 
    	// Verifica se a tecla seta para a direita foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
    		// volta o valor da variavel right em false depois que a tecla for solta
    		right = false;
        }
    	// Verifica se a tecla seta para cima foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_UP) {
    		// volta o valor da variavel up em false depois que a tecla for solta
    		up = false;
        }
    	// Verifica se a tecla seta para baixo foi solta
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        	// volta o valor da variavel down em false depois que a tecla for solta
        	down = false;
        }
    }//GEN-LAST:event_formKeyReleased
	
	// Inicializa a janela
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenProtector().setVisible(true);
            }
        });
	}
	
	
	// Implemente seu código aqui.
	public void run() {
		// A variável g recebe o objeto do tipo Graphics que permite gerar imagens na tela
		Graphics g = getBufferStrategy().getDrawGraphics();
		Random rand = new Random();
		
		SoundEffect backgroundSound = new SoundEffect ("/sounds/background.wav", true);
		backgroundSound.play();		
		
		// Instancie suas formas geométricas aqui
				Rectangle r1 = new Rectangle(Color.CYAN,100,100,50,100);
				Square s1 = new Square(Color.MAGENTA,500,300,50);
				Ellipse e1 = new Ellipse(Color.PINK, 600, 800, 100, 50);
				Circle c1 = new Circle(Color.LIGHT_GRAY,200,400,150);
				
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		Rectangle [] r = new Rectangle [5];
		Square [] s = new Square [5];
		Ellipse[] e = new Ellipse [5];
		Circle [] c = new Circle [5];
		
		for(int i=0; i<150; i++) {
			shapes.add( new Rectangle(colorGenerate(), 
								rand.nextInt(getWidth()-200),
								rand.nextInt(getHeight()-200),
								rand.nextInt(70)+10,
								rand.nextInt(70)));
		
			shapes.add( new Square(colorGenerate(), 
								rand.nextInt(getWidth()-200),
								rand.nextInt(getHeight()-200),
								rand.nextInt(70)+10));
		
			shapes.add( new Ellipse(colorGenerate(), 
								rand.nextInt(getWidth()-200),
								rand.nextInt(getHeight()-200),
								rand.nextInt(70)+10,
								rand.nextInt(70)));
		

	
			shapes.add( new Circle(colorGenerate(), 
								rand.nextInt(getWidth()-200),
								rand.nextInt(getHeight()-200),
								rand.nextInt(70)+10));
		}
		for(Shape shap : shapes) {
			if(rand.nextBoolean())
				shap.setSpeedX(-1);
			
			if(rand.nextBoolean())
				shap.setSpeedY(-1);
		}
		Image logo = new Image("/images/snoopy_logo.png",300,300,"/sounds/impact.wav", false);
		logo.scale(0.5);
		
		
			
		while(true) {
			//Atualiza g
			g = getBufferStrategy().getDrawGraphics();
			
			//limpa g
			g.clearRect(0, 0, getWidth(), getHeight());
			
		  // implementa
	      for(Shape shap : shapes) {
	       shap.draw(g);
	       shap.move();
	       shap.changeDir(0, getWidth(),0, getHeight());
	      }
	      
	     logo.draw(g);
	     
	     if(right)
	    	 logo.moveX(1);
	     if(left)
	    	 logo.moveX(-1);
	     if(down)
	    	 logo.moveY(1);
	     if(up)
	    	 logo.moveY(-1);
	     
	     logo.getColision(getWidth(), getHeight());
	       
	     
	     //exibe tela
	       getBufferStrategy().show();
	       
	      // Unidade de tempo da animação
	      try {
	        Thread.sleep(1);
	      }catch  (InterruptedException ex) {}
		}
		}//fim run
	
	public Color colorGenerate() {
		int r,g,b;
		Random rand = new Random();
		
		r = rand.nextInt(255);
		g = rand.nextInt(255);
		b = rand.nextInt(255);
		
		return new Color(r,g,b);
	}
	}