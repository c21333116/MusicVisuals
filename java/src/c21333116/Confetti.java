package c21333116;
//import processing.core.PApplet;

import java.util.Random;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Confetti extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private int width;
    private int height;
    private Random rand = new Random();

    public Confetti(int width, int height) {
        this.width = width;
        this.height = height;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new java.awt.Dimension(width, height));
        this.setDoubleBuffered(true);
    }

    public void addShape() {
        Shape shape = new Shape(rand.nextInt(width), 0, rand.nextInt(10) + 5, rand.nextInt(10) + 5, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        shapes.add(shape);
    }

    public void update() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            shape.update();
            if (shape.getY() > height) {
                shapes.remove(i);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void run() throws InterruptedException {
        while (true) {
            addShape();
            update();
            repaint();
            Thread.sleep(10);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Confetti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Confetti confetti = new Confetti(800, 600);
        frame.getContentPane().add(confetti);
        frame.pack();
        frame.setVisible(true);
        confetti.run();
    }

    private class Shape {
        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

        public Shape(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void update() {
            y += rand.nextInt(5) + 1;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
