import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class imagnesclase extends JFrame {
    private JLabel imageLabel;
    private JLabel textLabel;
    private JButton previousButton;
    private JButton nextButton;
    private int currentImageIndex;
    private String[][] imageInfo;

    public imagnesclase() {
        // Rutas de las imágenes y textos correspondientes
        imageInfo = new String[][]{
            {""},
            {"src/imagenes/Heroes/Planet-Earth.PNG", "Primera Imagen "},
            {"src/imagenes.Villanos/", "Segunda Imagen"},
            {"src/imagenes.Villanos/", "Tercera imagen"},
            // Añade más rutas de imágenes y textos aquí
        };

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Galería de Imágenes");
        setSize(400, 400);

        // Panel para la imagen
        JPanel imagePanel = new JPanel();
        imageLabel = new JLabel();
        imagePanel.add(imageLabel);

        // Panel para el texto
        JPanel textPanel = new JPanel();
        textLabel = new JLabel();
        textPanel.add(textLabel);

        // Panel para los botones
        JPanel buttonPanel = new JPanel();

        // Botón anterior
        previousButton = new JButton("Anterior");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });
        buttonPanel.add(previousButton);

        // Botón siguiente
        nextButton = new JButton("Siguiente");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });
        buttonPanel.add(nextButton);

        // Añadir los paneles a la ventana
        add(imagePanel, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.NORTH);
    }

    private void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            displayImage();
        }
    }

    private void showNextImage() {
        if (currentImageIndex < imageInfo.length - 1) {
            currentImageIndex++;
            displayImage();
        }
    }

    private void displayImage() {
        String imagePath = imageInfo[currentImageIndex][0];
        String text = imageInfo[currentImageIndex][1];

        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel.setIcon(imageIcon);
        textLabel.setText(text);
    }

    public static void main(String[] args) {
        imagnesclase gallery = new imagnesclase();
        gallery.setVisible(true);
    }
}
