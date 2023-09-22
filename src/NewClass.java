import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewClass extends JFrame {
    private JLabel imageLabel;
    private JButton previousButton;
    private JButton nextButton;
    private int currentImageIndex;
    private String[] imagePaths;

    public NewClass() {
        // Ruta de las imágenes
        imagePaths = new String[]{
            "C:\\Users\\Ricki Millones\\Documents\\NetBeansProjects\\Programacion1\\src\\imagenes\\Captura1.PNG",
            "C:\\Users\\Ricki Millones\\Documents\\NetBeansProjects\\Programacion1\\src\\imagenes\\Captura2.PNG",
            "C:\\Users\\Ricki Millones\\Documents\\NetBeansProjects\\Programacion1\\src\\imagenes\\Captura3.PNG",
            // Añade más rutas de imágenes aquí
        };

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Galería de Imágenes");
        setSize(400, 400);

        // Panel para los botones y la imagen
        JPanel mainPanel = new JPanel();

        // Botón anterior
        previousButton = new JButton("Anterior");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });
        mainPanel.add(previousButton);

        // Etiqueta para la imagen
        imageLabel = new JLabel();
        mainPanel.add(imageLabel);

        // Botón siguiente
        nextButton = new JButton("Siguiente");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });
        mainPanel.add(nextButton);

        // Añadir el panel principal a la ventana
        add(mainPanel, BorderLayout.CENTER);
    }

    private void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            displayImage();
        }
    }

    private void showNextImage() {
        if (currentImageIndex < imagePaths.length - 1) {
            currentImageIndex++;
            displayImage();
        }
    }

    private void displayImage() {
        String imagePath = imagePaths[currentImageIndex];
        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel.setIcon(imageIcon);
    }

    public static void main(String[] args) {
        NewClass gallery = new NewClass();
        gallery.setVisible(true);
    }
}


