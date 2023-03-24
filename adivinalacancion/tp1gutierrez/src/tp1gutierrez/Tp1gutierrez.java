package tp1gutierrez;

import javax.swing.*;

class Tp1gutierrez {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "¿Estás listo para poner a prueba tu cultura musical? \nEntonces dale a OK :)", "Adivina la canción", 
				JOptionPane.DEFAULT_OPTION,	new ImageIcon(Tp1gutierrez.class.getResource("/img/homero.gif")));
		
		String preg;
		int cant=0;
		final String c="Excelente", inc="Ou! Mal, muy mal. \nLa respuesta correcta es:\n";
		
				
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción",
		JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/flores.jpg")), null, null));
		if (preg.equalsIgnoreCase("flores amarillas")) {
		    JOptionPane.showMessageDialog(null, c, "Adivina la canción", JOptionPane.DEFAULT_OPTION, 
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
		    cant=cant+1;
		} else {
		    JOptionPane.showMessageDialog(null, inc+ "FLORES AMARILLAS", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));   }
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Tp1gutierrez.class.getResource("/img/bar.jpg")), null, null));
		if (preg.equalsIgnoreCase("bar")){
		    JOptionPane.showMessageDialog(null, c, "Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
		    cant=cant+1;
		} else {
		   JOptionPane.showMessageDialog(null, inc + "BAR", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg"))); } 
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en inglés", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/carrie.jpg")), null, null));
		if (preg.equalsIgnoreCase("carrie")) {
			JOptionPane.showMessageDialog(null, c, "Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
			cant=cant+1;
		} else {
            JOptionPane.showMessageDialog(null, inc + "CARRIE", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/ciega.jpg")), null, null));
		if (preg.equalsIgnoreCase("ciega sordomuda")) {
			JOptionPane.showMessageDialog(null, c,"Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
		     cant=cant+1;
		} else {
            JOptionPane.showMessageDialog(null, inc + "CIEGA SORDOMUDA", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/vasos.jpg")), null, null));
		if (preg.equalsIgnoreCase("vasos vacios")) {
			JOptionPane.showMessageDialog(null, c,"Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
			cant=cant+1;
		} else {
            JOptionPane.showMessageDialog(null, inc+"VASOS VACIOS", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/paisaje.jpg")), null, null));
		if (preg.equalsIgnoreCase("paisaje")) {
			JOptionPane.showMessageDialog(null, c,"Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
			cant=cant+1;
		} else {
            JOptionPane.showMessageDialog(null, inc+ "PAISAJE", "Adivina la canción",JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en español", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/corazon.jpg")), null, null));
		if (preg.equalsIgnoreCase("corazon partio")) {
			JOptionPane.showMessageDialog(null, c,"Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
			cant=cant+1;
		} else {
            JOptionPane.showMessageDialog(null, inc+"CORAZON PARTIO","Adivina la canción", JOptionPane.DEFAULT_OPTION,
		    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		JOptionPane.showMessageDialog(null, "¡Última pregunta! ¿Estás listo?", "Adivina la canción", JOptionPane.DEFAULT_OPTION,
	    		new ImageIcon(Tp1gutierrez.class.getResource("/img/piensa.jpg")));
		
		preg=(String)(JOptionPane.showInputDialog(null, "¿Qué canción es? \nPista: es en inglés", "Adivina la canción",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp1gutierrez.class.getResource("/img/one.jpg")), null, null));
		if (preg.equalsIgnoreCase("one way or another")) {
			JOptionPane.showMessageDialog(null, c,"Adivina la canción", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(Tp1gutierrez.class.getResource("/img/excelente.gif")));
			cant=cant+1;
		} else {
           JOptionPane.showMessageDialog(null, inc + "ONE WAY OR ANOTHER","Adivina la canción", JOptionPane.DEFAULT_OPTION,
   	    		new ImageIcon(Tp1gutierrez.class.getResource("/img/mal.jpg")));
		}
		
		if (cant>=5) {
			JOptionPane.showMessageDialog(null, "Iujuu! Ganaste!\nCantidad de respuestas correctas:" + cant, "Adivina la canción", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1gutierrez.class.getResource("/img/iuju.gif")));
		} else {
           JOptionPane.showMessageDialog(null, "F, ¡perdiste!\nCantidad de respuestas correctas:" + cant, "Adivina la canción", JOptionPane.DEFAULT_OPTION,
        		   new ImageIcon(Tp1gutierrez.class.getResource("/img/llora.gif")));
		}
		
		
	

		
		
	}

}